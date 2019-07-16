(ns aform.views
  (:require
   [re-frame.core :as re-frame]
   [aform.subs :as subs]
   [reagent.core :as r]
   ))




 (defn main-panel []

  (let [name (re-frame/subscribe [::subs/name] )]

(let [address (re-frame/subscribe [::subs/address] )]
(let [occu (re-frame/subscribe [::subs/occupation] )]
    [:div
     [:h4 "Hello from " @name]  
     
[:p "I am from " @address]
[:p "I am a " @occu] ]



)))


)
