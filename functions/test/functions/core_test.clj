(ns functions.core-test
  (:require [clojure.test :refer :all]
            [functions.core :refer :all]))

(deftest test-greet4
  (testing "with no args"
    (is (= (greet4) "Hello, World!")))
  (testing "greet4 with name"
    (is (= (greet4 "Jully") "Hello, Jully!")))
  (testing "with greetings and name"
    (is (= (greet4 "Holla" "Clojure") "Holla, Clojure!"))))
