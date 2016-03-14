(defproject eu.cassiel/clojure-zeroconf "1.2.0"
  :description "Zeroconf client in Clojure"
  :url "https://github.com/cassiel/clojure-zeroconf"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.slf4j/slf4j-api "1.7.18"]
                 [org.slf4j/slf4j-simple "1.7.18"]
                 [org.jmdns/jmdns "3.5.0"]
                 [org.clojure/clojure "1.6.0"]]
  :repositories {"bintray" "https://dl.bintray.com/jmdns/mvn/"}
  :plugins [[lein-marginalia "0.8.0"]])