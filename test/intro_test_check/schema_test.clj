(ns intro-test-check.schema-test
  (:require
    [clojure.test :refer :all]
    [com.gfredericks.test.chuck.clojure-test :refer [checking]]
    [intro-test-check.schema :refer :all]
    [clojure.test.check.generators :as gen]
    [schema-gen.core :as s-gen]))

#_(deftest a-test
  (checking "my-sort" 1000 [c (s-gen/schema->gen Carrinho)]
    (is (>= (quantidade-itens c) 0))
    (is (>= (quantidade-produtos c) 0))
    (is (>= (valor-total c) 0))))
