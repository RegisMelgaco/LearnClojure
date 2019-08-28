(ns functions.core
  (:gen-class))

(defn greet1 [] (prn "Hello"))

(defn test1 [] (greet1))


(def greet2 (fn [] (prn "Hello")))

(def greet3 #(prn "Hello"))

(defn test2 [] (do (greet2) (greet3)))

(
  defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do (test1) (test2))
)
