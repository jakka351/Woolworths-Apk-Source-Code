package com.woolworths.shop.healthylife.foodtracker.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.healthylife.foodtracker.UpdateFoodTrackerConsentMutation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/UpdateFoodTrackerConsentMutation_ResponseAdapter;", "", "Data", "UpdateFoodTrackerConsent", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateFoodTrackerConsentMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/UpdateFoodTrackerConsentMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$Data;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UpdateFoodTrackerConsentMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22772a = new Data();
        public static final List b = CollectionsKt.Q("updateFoodTrackerConsent");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent updateFoodTrackerConsent = null;
            while (reader.o2(b) == 0) {
                updateFoodTrackerConsent = (UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent) Adapters.b(Adapters.c(UpdateFoodTrackerConsent.f22773a, false)).fromJson(reader, customScalarAdapters);
            }
            return new UpdateFoodTrackerConsentMutation.Data(updateFoodTrackerConsent);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateFoodTrackerConsentMutation.Data value = (UpdateFoodTrackerConsentMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("updateFoodTrackerConsent");
            Adapters.b(Adapters.c(UpdateFoodTrackerConsent.f22773a, false)).toJson(writer, customScalarAdapters, value.f22754a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/healthylife/foodtracker/adapter/UpdateFoodTrackerConsentMutation_ResponseAdapter$UpdateFoodTrackerConsent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/healthylife/foodtracker/UpdateFoodTrackerConsentMutation$UpdateFoodTrackerConsent;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UpdateFoodTrackerConsent implements Adapter<UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent> {

        /* renamed from: a, reason: collision with root package name */
        public static final UpdateFoodTrackerConsent f22773a = new UpdateFoodTrackerConsent();
        public static final List b = CollectionsKt.R("status", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent(bool.booleanValue(), str);
            }
            Assertions.a(reader, "status");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent value = (UpdateFoodTrackerConsentMutation.UpdateFoodTrackerConsent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("status");
            d.B(value.f22755a, Adapters.f, writer, customScalarAdapters, "message");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }
}
