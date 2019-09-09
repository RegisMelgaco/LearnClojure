(ns functions.core
  (:gen-class))

(defn greet1
  []
  (prn "Hello1"))

(def greet2
  (fn
    []
    (prn "Hello2")))

(def greet3 #(prn "Hello3"))

(defn greet4
  ([]
    "Hello, World!")
  ([x]
    (str "Hello, " x "!"))
  ([x y]
    (str x ", " y "!")))
(
  defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do (greet1) (greet2) (greet3))
)
