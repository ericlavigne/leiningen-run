(ns leiningen.run
  "Run the application."
  (:use [leiningen.compile :only [eval-in-project]]))

(defn run [project]
  (let [main-class (str (:main project))
	main-fn "-main"]
    (eval-in-project project
		     `(do (require (symbol ~main-class))
			  (apply (ns-resolve (symbol ~main-class) 
					     (symbol ~main-fn)) 
				 [])))))

