(ns build
  (:require [clojure.tools.build.api :as api]))

(def app 'clojure-indonesia/hello-world)
(def version "0.0.1")
(def class-dir "target/classes")
(def basis (api/create-basis {:project "deps.edn"}))
(def uber-file (format "target/%s-%s-standalone.jar" (name app) version))

(defn clean
  [_]
  (api/delete {:path "target"}))

(defn uber
  [_]
  (clean nil)
  (api/copy-dir {:src-dirs ["src"]
                 :target-dir class-dir})
  (api/compile-clj {:basis basis
                    :src-dirs ["src"]
                    :class-dir class-dir})
  (api/uber {:class-dir class-dir
             :uber-file uber-file
             :basis basis
             :main 'hello-world.core}))
