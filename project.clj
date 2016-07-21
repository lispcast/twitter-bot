(defproject twitter-bot "0.1.0-SNAPSHOT"
  :description "A Twitter Bot in Clojure. Part of PurelyFunctional.tv"
  :url "https://purelyfunctional.tv/clojure-twitter-bot"
  :license {:name "CC0 1.0 Universal (CC0 1.0) Public Domain Dedication"
            :url "http://creativecommons.org/publicdomain/zero/1.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [twitter-api "0.7.8"]
                 [clj-http "2.1.0"]]
  :main twitter-bot.core)
