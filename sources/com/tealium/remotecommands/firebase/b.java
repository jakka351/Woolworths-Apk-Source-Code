package com.tealium.remotecommands.firebase;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.checkout.models.CouponResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b implements a {
    public static final HashMap b;
    public static final HashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAnalytics f19205a;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put("event_add_payment_info", "add_payment_info");
        map.put("event_add_shipping_info", "add_shipping_info");
        map.put("event_add_to_cart", "add_to_cart");
        map.put("event_add_to_wishlist", "add_to_wishlist");
        map.put("event_app_open", "app_open");
        map.put("event_begin_checkout", "begin_checkout");
        map.put("event_campaign_details", "campaign_details");
        map.put("event_earn_virtual_currency", "earn_virtual_currency");
        map.put("event_generate_lead", "generate_lead");
        map.put("event_join_group", "join_group");
        map.put("event_level_end", "level_end");
        map.put("event_level_start", "level_start");
        map.put("event_level_up", "level_up");
        map.put("event_login", "login");
        map.put("event_post_score", "post_score");
        map.put("event_purchase", "purchase");
        map.put("event_refund", "refund");
        map.put("event_remove_cart", "remove_from_cart");
        map.put("event_search", "search");
        map.put("event_select_content", "select_content");
        map.put("event_select_item", "select_item");
        map.put("event_select_promotion", "select_promotion");
        map.put("event_share", "share");
        map.put("event_signup", "sign_up");
        map.put("event_spend_virtual_currency", "spend_virtual_currency");
        map.put("event_tutorial_begin", "tutorial_begin");
        map.put("event_tutorial_complete", "tutorial_complete");
        map.put("event_unlock_achievement", "unlock_achievement");
        map.put("event_view_cart", "view_cart");
        map.put("event_view_item", "view_item");
        map.put("event_view_item_list", "view_item_list");
        map.put("event_view_promotion", "view_promotion");
        map.put("event_view_search_results", "view_search_results");
        HashMap map2 = new HashMap();
        c = map2;
        map2.put("param_achievement_id", "achievement_id");
        map2.put("param_ad_network_click_id", "aclid");
        map2.put("param_affiliation", "affiliation");
        map2.put("param_cp1", "cp1");
        map2.put("param_campaign", NotificationResult.Notification.CAMPAIGN);
        map2.put("param_character", "character");
        map2.put("param_content", "content");
        map2.put("param_content_type", i.a.k);
        map2.put("param_coupon", CouponResponse.Discount.COUPON);
        map2.put("param_creative_name", "creative_name");
        map2.put("param_creative_slot", "creative_slot");
        map2.put("param_currency", "currency");
        map2.put("param_destination", "destination");
        map2.put("param_discount", "discount");
        map2.put("param_end_date", i.a.i);
        map2.put("param_extend_session", "extend_session");
        map2.put("param_flight_number", "flight_number");
        map2.put("param_group_id", "group_id");
        map2.put("param_index", "index");
        map2.put("param_items", "items");
        map2.put("param_item_brand", "item_brand");
        map2.put("param_item_category", "item_category");
        map2.put("param_item_id", "item_id");
        map2.put("param_item_list_id", "item_list_id");
        map2.put("param_item_list_name", "item_list_name");
        map2.put("param_item_name", "item_name");
        map2.put("param_item_variant", "item_variant");
        map2.put("param_level", "level");
        map2.put("param_level_name", "level_name");
        map2.put("param_location", "location");
        map2.put("param_location_id", "location_id");
        map2.put("param_medium", "medium");
        map2.put("param_method", "method");
        map2.put("param_number_nights", "number_of_nights");
        map2.put("param_number_pax", "number_of_passengers");
        map2.put("param_number_rooms", "number_of_rooms");
        map2.put("param_origin", "origin");
        map2.put("param_payment_type", "payment_type");
        map2.put("param_price", "price");
        map2.put("param_promotion_id", "promotion_id");
        map2.put("param_promotion_name", "promotion_name");
        map2.put("param_quantity", "quantity");
        map2.put("param_score", "score");
        map2.put("param_search_term", "search_term");
        map2.put("param_shipping", "shipping");
        map2.put("param_shipping_tier", "shipping_tier");
        map2.put("param_source", "source");
        map2.put("param_start_date", i.a.h);
        map2.put("param_success", "success");
        map2.put("param_tax", "tax");
        map2.put("param_term", "term");
        map2.put("param_transaction_id", "transaction_id");
        map2.put("param_travel_class", "travel_class");
        map2.put("param_value", "value");
        map2.put("param_virtual_currency_name", "virtual_currency_name");
    }

    public b(Context context) {
        this.f19205a = FirebaseAnalytics.getInstance(context);
    }

    public static Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String str = (String) c.get(next);
            if (str == null) {
                str = next;
            }
            try {
                switch (str.hashCode()) {
                    case -2042876595:
                        if (str.equals("number_of_nights")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case -1867169789:
                        if (str.equals("success")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case -1447491898:
                        if (str.equals("number_of_rooms")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case -1285004149:
                        if (str.equals("quantity")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case -674364405:
                        if (str.equals("number_of_passengers")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case -516235858:
                        if (str.equals("shipping")) {
                            bundle.putDouble(str, jSONObject.getDouble(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 114603:
                        if (str.equals("tax")) {
                            bundle.putDouble(str, jSONObject.getDouble(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 100526016:
                        if (str.equals("items")) {
                            JSONArray jSONArray = jSONObject.getJSONArray(next);
                            Parcelable[] parcelableArr = new Parcelable[jSONArray.length()];
                            for (int i = 0; i < jSONArray.length(); i++) {
                                parcelableArr[i] = a(jSONArray.getJSONObject(i));
                            }
                            bundle.putParcelableArray(str, parcelableArr);
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 102865796:
                        if (str.equals("level")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 106934601:
                        if (str.equals("price")) {
                            bundle.putDouble(str, jSONObject.getDouble(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 109264530:
                        if (str.equals("score")) {
                            bundle.putLong(str, jSONObject.getLong(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 111972721:
                        if (str.equals("value")) {
                            bundle.putDouble(str, jSONObject.getDouble(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    case 273184065:
                        if (str.equals("discount")) {
                            bundle.putDouble(str, jSONObject.getDouble(next));
                            break;
                        } else {
                            bundle.putString(str, jSONObject.getString(next));
                            break;
                        }
                    default:
                        bundle.putString(str, jSONObject.getString(next));
                        break;
                }
            } catch (JSONException unused) {
                Log.d("Tealium-Firebase", "jsonToBundle: Error converting value for key: " + str + ". Adding as String.");
                if (!bundle.containsKey(str)) {
                    bundle.putString(str, jSONObject.getString(next));
                }
            }
        }
        return bundle;
    }

    public final void b(Integer num, Integer num2, Boolean bool) {
        int iIntValue = num.intValue();
        FirebaseAnalytics firebaseAnalytics = this.f19205a;
        if (iIntValue > 0) {
            firebaseAnalytics.f15179a.zzt(num.intValue());
        }
        if (num2.intValue() > 0) {
            firebaseAnalytics.setMinimumSessionDuration(num2.longValue());
        }
        firebaseAnalytics.f15179a.zzq(bool);
    }
}
