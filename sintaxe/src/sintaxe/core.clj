(ns sintaxe.core
  (:gen-class))

(
  defn test1 []
  (prn (str "Soma: " (+ 7654 1234)))
)
(
  defn test2 []
  (prn (str "Equation: " (/ (* (+ 7 3) (+ 4 5)) 10)))
)

(
  defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do (test1) (test2))
)
