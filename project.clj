(defproject com.mirego/struct "1.1.1"
  :description "A structural validation library for Clojure(Script)"
  :url "https://github.com/mirego/struct"
  :license {:name "Public Domain" :url "http://unlicense.org/"}
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.854" :scope "provided"]
                 [funcool/cuerdas "2.0.3"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :codeina {:sources ["src"]
            :reader :clojure
            :target "doc/dist/latest/api"}
  :plugins [[funcool/codeina "0.4.0"]
            [lein-ancient "0.6.10" :exclusions [org.clojure/tools.reader]]])
