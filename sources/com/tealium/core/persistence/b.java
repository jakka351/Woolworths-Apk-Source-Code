package com.tealium.core.persistence;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/persistence/b;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/tealium/core/persistence/Serde;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
class b<T> implements Serde<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Serializer f19167a;
    public final Deserializer b;

    public b(Serializer serializer, Deserializer deserializer) {
        this.f19167a = serializer;
        this.b = deserializer;
    }

    @Override // com.tealium.core.persistence.Serde
    /* renamed from: a, reason: from getter */
    public final Serializer getF19167a() {
        return this.f19167a;
    }

    @Override // com.tealium.core.persistence.Serde
    /* renamed from: b, reason: from getter */
    public final Deserializer getB() {
        return this.b;
    }
}
