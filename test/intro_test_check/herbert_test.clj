(ns intro-test-check.herbert-test
  (:require
    [clojure.test :refer :all]
    [com.gfredericks.test.chuck.clojure-test :refer [checking]]
    [intro-test-check.herbert :refer :all]
    [clojure.test.check.generators :as gen]
    [miner.herbert.generators :as h-gen]))

(deftest a-test
  (checking "my-sort" 1000 [c (h-gen/generator Carrinho)]
    (is (>= (quantidade-itens c) 0))
    (is (>= (quantidade-produtos c) 0))
    (is (>= (valor-total c) 0))))
