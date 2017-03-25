package com.codyburleson.confluence.macro;

import com.atlassian.confluence.content.render.xhtml.ConversionContext;
import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import com.atlassian.plugin.spring.scanner.annotation.component.Scanned;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
//import com.atlassian.renderer.RenderContext;
import com.atlassian.renderer.v2.RenderMode;
//import com.atlassian.renderer.v2.macro.BaseMacro;
//import com.atlassian.renderer.v2.macro.MacroException;
import com.atlassian.webresource.api.assembler.PageBuilderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Scanned
public class Panel implements Macro {

	// The pageBuilderService is required for the Web Resource Plugin Module
	private PageBuilderService pageBuilderService;

	@Autowired
	public Panel(@ComponentImport PageBuilderService pageBuilderService) {
		this.pageBuilderService = pageBuilderService;
	}

	// ConversionContext is a type of RenderContext, I think

	public BodyType getBodyType() {
		//return BodyType.PLAIN_TEXT;
		return BodyType.RICH_TEXT;
	}

	public OutputType getOutputType() {
		return OutputType.BLOCK;
	}

	public RenderMode getBodyRenderMode() {
		return RenderMode.ALL; // Render everything
		// return RenderMode.NO_RENDER // Don't render anything: just return the
		// raw wiki text
		// return RenderMode.INLINE // Render things you'd normally find inside
		// a paragraph, like links, text effects and so on
		// return RenderMode.SIMPLE_TEXT // Render text made up only of
		// paragraphs, without images or links
	}

	public boolean hasBody() {
		return true;
	}

	/*
	public String execute(Map map, String body, RenderContext context) throws MacroException {
		return executeMacro(map,body,context);
	}
	*/

	public String execute(Map<String, String> map, String body, ConversionContext context)
			throws MacroExecutionException {
		
		
		pageBuilderService.assembler().resources()
				.requireWebResource("com.codyburleson.confluence.panelMacro:panelMacro-resources");
		
		// HTML structure and CSS class names from
		// From Bootstrap CSS v3.3.7, http://getbootstrap.com/components/#panels
		
		StringBuilder sb = new StringBuilder();
		sb.append("<div class=\"cb-panel cb-panel-");
		if(map.get("Style") != null) {
			sb.append(map.get("Style")).append("\">");
		} else {
			sb.append("default").append("\">");
		}
		
		
		if (map.get("Title") != null) {
			sb.append("<div class=\"cb-panel-heading\">");
			sb.append("<h3 class=\"cb-panel-title\">").append(map.get("Title")).append("</h3>");
			sb.append("</div>");
		
			sb.append("<div class=\"cb-panel-body\">");
			sb.append(body);
			sb.append("</div>");
		
		} else {
			sb.append("<div class=\"cb-panel-body\">");
			sb.append(body);
			sb.append("</div>");
		}
		
		sb.append("</div>");
		return sb.toString();
	}
	


}