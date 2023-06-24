(ns hello-world.core
  (:gen-class))

(defn greet
  []
  "Hello, world!")

(defn -main
  []
  (println (greet)))
