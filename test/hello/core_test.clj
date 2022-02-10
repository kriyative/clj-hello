(ns hello.core-test
  (:require
   [clojure.test :refer :all]
   [hello.core :as core]))

(deftest basic
  (is (= "me" (core/hello "me"))))
