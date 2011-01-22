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
