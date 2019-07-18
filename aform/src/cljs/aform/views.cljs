(ns aform.views
  (:require
   [re-frame.core :as re-frame]
   [aform.subs :as subs]
   [reagent.core :as r]))


( defn form-layout []
     [:div.ui.form
      [:div.required.field
         [:label "Name:- "]
         [:input {:type "text"}]]

      [:br]

      (->> ["10th" "12th" "Graduate" "Post-Graduate" "Other"]
       (map (fn [type]
                [:div.field
                 [:div.ui.radio.checkbox
                    [:input {:type "radio" :name type}]
                    [:label type]]]))



       (into [:div.inline.fields
                 [:label "QUALIFICATION"]]))



      [ :br]


      [:div
          [:input {:type "button" :value "SUBMIT"
                   :on-click #(re-frame/dispatch [:submit])}]]])









(defn main-panel []

 (let [name (re-frame/subscribe [::subs/name])
        address (re-frame/subscribe [::subs/address])
        occu (re-frame/subscribe [::subs/occupation])
        result (re-frame/subscribe [::subs/result])]
 [:div
    [:h4 "Hello from " @name]
    [:p "I am from " @address]
    [:p "I am a " @occu] 
    [:h4 "FORM STATUS:-" @result]
    [:h2 "FILL THE FORM"]

    [form-layout]]))
