(ns hello.core-test
  (:require
   [clojure.test :refer :all]
   [hello.core :as core]))

(deftest basic
  (is (= "World" (core/hello "World"))))
