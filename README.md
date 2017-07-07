# Confluence Panel Macro

A macro for Atlassian Confluence that emulates a Bootstrap 3 Panel.

The macro takes an optional Title, an optional Style, and a rich text macro body. It renders results as shown in the 
examples section below.

_See also: [Confluence Panel Macro](https://codyburleson.com/display/blog/2017/03/25/Confluence+Panel+Macro) 
at [codyburleson.com](https://codyburleson.com)._

## Examples

![No Style Selected](doc/images/no-style-selected.png)

![Default](doc/images/default.png)

![Primary](doc/images/primary.png)

![Success](doc/images/success.png)

![Info](doc/images/info.png)

![Warning](doc/images/warning.png)

![Danger](doc/images/danger.png)

## Download

If you don't care to build from the source code yourself, you can download the latest version to install into your 
Atlassian Confluence wiki.

**[Download panelMacro-1.0.0-SNAPSHOT.jar](https://github.com/codyburleson/confluence-panel-macro/blob/master/dist/panelMacro-1.0.0-SNAPSHOT.jar?raw=true)**


## Installation

- Navigate to the Manage Add-ons section in Confluence Administration (`gear icon` > `Add-ons`); _you must be a 
 Confluence Administrator to install add-ons._
- Click the link to `upload add-on`
- Choose the downloaded jar file or enter the URL from the link above and click Upload.

## Developer getting started

If you'd like to fork and modify the macro plugin to suit your own needs, or even better - 
contribute changes, go for it! If you're not familiar with Atlassian plugin development, start here:

- [Atlassian's Plugin SDK](https://developer.atlassian.com/x/ZAIr)

Once you understand Atlassian's Plugin SDK, here are the SDK commands you'll most commonly use:

* `atlas-run`   -- installs this plugin into the product and starts it on localhost
* `atlas-debug` -- same as atlas-run, but allows a debugger to attach at port 5005
* `atlas-cli`   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* `atlas-help`  -- prints description for all commands in the SDK

I've used IntelliJ IDEA, so you'll probably find it easiest to work with the project using that IDE. 
Still, it's probably easily adaptable to your tool of choice.

## Issues and feedback

Please feel free to open issues in this GitHub repo if you find any problems, if you have questions, or if you have 
enhancement requests. I can't guarantee a timely response, but I'll sure try.

## Contribute

If you fix something or improve the plugin, please issue a pull request so we can share the love.


