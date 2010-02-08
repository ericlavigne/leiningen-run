(ns leiningen.run
  "Run the application."
  (:use [leiningen.compile :only [eval-in-project]]))

(defn run [project & args]
  (eval-in-project 
   project
   (cond (:script project) `(do (require 'clojure.main)
				(clojure.main/main "--init" 
						   ~(:script project)
						   ~@args))
	 (:main project) (let [main-class (str (:main project))]
			   `(do (require (symbol ~main-class))
				(apply (ns-resolve (symbol ~main-class) 
						   (symbol "-main")) 
				       ~(vec args))))
	 :else "leiningen-run requires that you set either :main or :script in project.clj.")))

