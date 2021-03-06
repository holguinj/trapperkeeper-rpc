(ns puppetlabs.trapperkeeper.rpc.testutils.dummy-services.concrete
  (:require [puppetlabs.trapperkeeper.rpc.testutils.dummy-services :refer [RPCTestService]]
            [puppetlabs.trapperkeeper.rpc.core :refer [call-remote-svc-fn]]
            [puppetlabs.trapperkeeper.services :refer [defservice]]))


(defservice rpc-test-service-concrete
  RPCTestService
  []
  (add [this x y] (+ x y))
  (fun-divide [this x] (/ x 0)))
