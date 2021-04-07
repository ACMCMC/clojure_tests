(ns clojure.examples.hello
	(:gen-class))

(def fun-ho (fn [x] (fn [a b] (format "Hello, %s %s %s" x a b))))

(def f (fun-ho "str3"))

(def one-to-four '(1 2 3 4))
(print (first one-to-four))

(print (f "str1" "str2"))
(print (f "str4" "str5"))
