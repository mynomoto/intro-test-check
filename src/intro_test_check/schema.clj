(ns intro-test-check.schema
  (:require
    [schema.core :as s]))

(def Carrinho
  "Um schema para um carrinho de compras"
  {:itens [{:nome s/Str
            :quantidade s/Int
            :valor s/Num}]
   :status (s/enum :abandonado :em-uso :comprado)})

(defn quantidade-itens [carrinho]
  (count (:itens carrinho)))

(defn quantidade-produtos [carrinho]
  (reduce + (map :quantidade (:itens carrinho))))

(defn valor-total [carrinho]
  (reduce + (map :valor (:itens carrinho))))
