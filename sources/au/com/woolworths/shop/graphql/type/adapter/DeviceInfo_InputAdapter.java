package au.com.woolworths.shop.graphql.type.adapter;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.DeviceInfo;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/adapter/DeviceInfo_InputAdapter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/graphql/type/DeviceInfo;", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceInfo_InputAdapter implements Adapter<DeviceInfo> {

    /* renamed from: a, reason: collision with root package name */
    public static final DeviceInfo_InputAdapter f12069a = new DeviceInfo_InputAdapter();

    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
        throw a.j(jsonReader, "reader", customScalarAdapters, "customScalarAdapters", "Input type used in output position");
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        DeviceInfo value = (DeviceInfo) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Optional optional = value.l;
        Optional optional2 = value.k;
        Optional optional3 = value.j;
        Optional optional4 = value.i;
        Optional optional5 = value.h;
        Optional optional6 = value.g;
        Optional optional7 = value.f;
        Optional optional8 = value.e;
        Optional optional9 = value.d;
        Optional optional10 = value.c;
        Optional optional11 = value.b;
        Optional optional12 = value.f11344a;
        if (optional12 instanceof Optional.Present) {
            writer.F1("deviceModel");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional12);
        }
        if (optional11 instanceof Optional.Present) {
            writer.F1("deviceVendor");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional11);
        }
        if (optional10 instanceof Optional.Present) {
            writer.F1("operatingSystem");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional10);
        }
        if (optional9 instanceof Optional.Present) {
            writer.F1("screenResolution");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional9);
        }
        if (optional8 instanceof Optional.Present) {
            writer.F1("screenResolutionInCm");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional8);
        }
        if (optional7 instanceof Optional.Present) {
            writer.F1("usableScreenResolution");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional7);
        }
        if (optional6 instanceof Optional.Present) {
            writer.F1("usableScreenResolutionInCm");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional6);
        }
        if (optional5 instanceof Optional.Present) {
            writer.F1("phoneNetworkRetailer");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional5);
        }
        if (optional4 instanceof Optional.Present) {
            writer.F1("mobileSignalStrength");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional4);
        }
        if (optional3 instanceof Optional.Present) {
            writer.F1("storageSpaceAvailable");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional3);
        }
        if (optional2 instanceof Optional.Present) {
            writer.F1("appVersion");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional2);
        }
        if (optional instanceof Optional.Present) {
            writer.F1("locationData");
            Adapters.d(Adapters.i).toJson(writer, customScalarAdapters, (Optional.Present) optional);
        }
    }
}
