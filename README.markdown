# Leiningen-Run

This Leiningen plugin served as prototype for the "run" command that was later added to Leiningen core.
Prior to this, there was no simple way for Clojure programmers to just run a Clojure program with
multiple files or dependencies. The least painful option had been a two-step process with Leiningen:
(1) compile into an uberjar and (2) run the uberjar.

Now that this plugin has served as inspiration for the core "run" feature, the
[Leiningen README](https://github.com/technomancy/leiningen#basic-usage) is the best
source for usage documentation. The documentation below has been kept only for historical
value.

## Usage

This Leiningen plugin allows you to run your program.

    lein run

If your program expects command-line arguments, the run plugin allows you to provide those as follows.

    lein run 8080

In order to use this plugin, you will need to specify a :main class and add leiningen-run to your :dev-dependencies in project.clj, as in the following example from an [island-wari](http://github.com/ericlavigne/island-wari) web application.

    (defproject island-wari "0.1"
      :description "Web application for playing the Island Wari game."
      :main wari
      :dependencies     [[org.clojure/clojure "1.1.0"]
                         [org.clojure/clojure-contrib "1.1.0"]
                         [org.clojars.liebke/compojure "0.3.1-master"]]
      :dev-dependencies [[leiningen-run "0.3"]])

This plugin is available on [Clojars](http://clojars.org/leiningen-run).
