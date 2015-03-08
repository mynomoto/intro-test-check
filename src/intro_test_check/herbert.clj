(ns intro-test-check.herbert
  (:require
    [miner.herbert :as h]))

(def Carrinho
  "Um schema para um carrinho de compras"
  '{:itens [{:nome str
             :quantidade (and int pos)
             :valor (and num pos)}]
    :status (or :abandonado :em-uso :comprado)})

(defn quantidade-itens [carrinho]
  (count (:itens carrinho)))

(defn quantidade-produtos [carrinho]
  (reduce + (map :quantidade (:itens carrinho))))

(defn valor-total [carrinho]
  (reduce + (map :valor (:itens carrinho))))
