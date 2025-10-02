package au.com.woolworths.feature.shop.instore.navigation.map;

import au.com.woolworths.feature.shop.instore.navigation.map.MappedStoreInfo;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MappedStoreInfo.Companion companion = MappedStoreInfo.INSTANCE;
        return new LinkedHashMapSerializer(StringSerializer.f24821a, BooleanSerializer.f24779a);
    }
}
