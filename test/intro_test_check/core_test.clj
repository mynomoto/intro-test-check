(ns intro-test-check.core-test
  (:require
    [clojure.test :refer :all]
    [com.gfredericks.test.chuck.clojure-test :refer [checking]]
    [intro-test-check.core :refer :all]
    [clojure.test.check.generators :as gen]))

(deftest a-test
  (checking "my-sort" 1000 [v (gen/vector gen/pos-int)]
    (is (= (count (my-sort v)) (count v)))
    ))
