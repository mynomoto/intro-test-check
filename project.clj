(defproject intro-test-check "0.1.0-SNAPSHOT"
  :description "Simple project for test.check introduction"
  :url "https://github.com/mynomoto/intro-test-check"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.velisco/herbert "0.6.7"]
                 [prismatic/schema "0.4.0"]]
  :plugins [[com.jakemccrary/lein-test-refresh "0.7.0"]]
  :profiles {:dev
             {:dependencies
              [[org.clojure/test.check "0.7.0"]
               [com.gfredericks/test.chuck "0.1.16"]
               [schema-gen "0.1.4"]]}})
