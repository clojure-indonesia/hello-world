(ns hello-world.core-test
  (:require [hello-world.core :refer [greet]]
            [clojure.test :refer [deftest is testing]]))

(deftest testing-ns-core-fn-greet
  (testing "testing-ns-core-fn-greet"
    (is (= "Hello, world!" (greet)))))
