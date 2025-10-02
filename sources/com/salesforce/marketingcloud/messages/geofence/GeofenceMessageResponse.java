package com.salesforce.marketingcloud.messages.geofence;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.MessageResponse;
import com.salesforce.marketingcloud.messages.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@MCKeep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0002\b\u0010J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0011J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0012R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/salesforce/marketingcloud/messages/geofence/GeofenceMessageResponse;", "Lcom/salesforce/marketingcloud/messages/MessageResponse;", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "refreshCenter", "Lcom/salesforce/marketingcloud/location/LatLon;", "refreshRadius", "", "fences", "", "Lcom/salesforce/marketingcloud/messages/Region;", "(Lcom/salesforce/marketingcloud/location/LatLon;ILjava/util/List;)V", "()Ljava/util/List;", "()Lcom/salesforce/marketingcloud/location/LatLon;", "()I", "-deprecated_fences", "-deprecated_refreshCenter", "-deprecated_refreshRadius", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class GeofenceMessageResponse implements MessageResponse {

    @NotNull
    private final List<Region> fences;

    @NotNull
    private final LatLon refreshCenter;
    private final int refreshRadius;

    public static final class a extends Lambda implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16989a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to parse Region from geofence message payload.";
        }
    }

    public GeofenceMessageResponse(@NotNull LatLon refreshCenter, int i, @NotNull List<Region> fences) {
        Intrinsics.h(refreshCenter, "refreshCenter");
        Intrinsics.h(fences, "fences");
        this.refreshCenter = refreshCenter;
        this.refreshRadius = i;
        this.fences = fences;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_fences, reason: not valid java name */
    public final List<Region> m148deprecated_fences() {
        return this.fences;
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_refreshCenter, reason: not valid java name */
    public final LatLon m149deprecated_refreshCenter() {
        return getRefreshCenter();
    }

    @Deprecated
    @JvmName
    /* renamed from: -deprecated_refreshRadius, reason: not valid java name */
    public final int m150deprecated_refreshRadius() {
        return getRefreshRadius();
    }

    @JvmName
    @NotNull
    public final List<Region> fences() {
        return this.fences;
    }

    @Override // com.salesforce.marketingcloud.messages.MessageResponse
    @JvmName
    @NotNull
    /* renamed from: refreshCenter, reason: from getter */
    public LatLon getRefreshCenter() {
        return this.refreshCenter;
    }

    @Override // com.salesforce.marketingcloud.messages.MessageResponse
    @JvmName
    /* renamed from: refreshRadius, reason: from getter */
    public int getRefreshRadius() {
        return this.refreshRadius;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public GeofenceMessageResponse(@NotNull JSONObject json) throws JSONException {
        ?? arrayList;
        Region region;
        Object string;
        JSONObject jSONObject;
        Intrinsics.h(json, "json");
        LatLon latLonA = com.salesforce.marketingcloud.messages.a.a(json);
        int iB = com.salesforce.marketingcloud.messages.a.b(json);
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("fences");
        if (jSONArrayOptJSONArray != null) {
            IntRange intRangeO = RangesKt.o(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                int iNextInt = it.nextInt();
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                KClass kClassB = reflectionFactory.b(JSONObject.class);
                if (kClassB.equals(reflectionFactory.b(JSONObject.class))) {
                    jSONObject = jSONArrayOptJSONArray.getJSONObject(iNextInt);
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    if (kClassB.equals(reflectionFactory.b(Integer.TYPE))) {
                        string = Integer.valueOf(jSONArrayOptJSONArray.getInt(iNextInt));
                    } else if (kClassB.equals(reflectionFactory.b(Double.TYPE))) {
                        string = Double.valueOf(jSONArrayOptJSONArray.getDouble(iNextInt));
                    } else if (kClassB.equals(reflectionFactory.b(Long.TYPE))) {
                        string = Long.valueOf(jSONArrayOptJSONArray.getLong(iNextInt));
                    } else if (kClassB.equals(reflectionFactory.b(Boolean.TYPE))) {
                        string = Boolean.valueOf(jSONArrayOptJSONArray.getBoolean(iNextInt));
                    } else if (kClassB.equals(reflectionFactory.b(String.class))) {
                        string = jSONArrayOptJSONArray.getString(iNextInt);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        string = jSONArrayOptJSONArray.get(iNextInt);
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    }
                    jSONObject = (JSONObject) string;
                }
                arrayList2.add(jSONObject);
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    region = new Region((JSONObject) it2.next());
                } catch (Exception e) {
                    g.f16896a.b(Region.INSTANCE.m146TAG(), e, a.f16989a);
                    region = null;
                }
                if (region != null) {
                    arrayList.add(region);
                }
            }
        } else {
            arrayList = EmptyList.d;
        }
        this(latLonA, iB, arrayList);
    }
}
