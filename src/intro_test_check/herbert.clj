(ns intro-test-check.herbert
  (:require
    [miner.herbert :as h]))

(def Carrinho
  "Um schema para um carrinho de compras"
  '{:itens [{:nome str
             :quantidade (int 0 10000)
             :valor (num 0 10000)}]
    :status (or :abandonado :em-uso :comprado)})

(defn quantidade-itens [carrinho]
  (count (:itens carrinho)))

(defn quantidade-produtos [carrinho]
  (reduce + (map :quantidade (:itens carrinho))))

(defn valor-total [carrinho]
  (reduce + (map :valor (:itens carrinho))))
