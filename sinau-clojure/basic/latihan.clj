
(ns indra.belajar
  (:gen-class))

(defonce variabel "hello world")

(defn hello-world []
  (println variabel))

(hello-world)
(println (+ 3 4))
