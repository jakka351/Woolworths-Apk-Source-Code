package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BuildingInteractorImpl$fetchBuildingForWooliesStore$2$1$onBuildingReceived$1$onCreated$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(Integer.valueOf(((Floor) obj).d), Integer.valueOf(((Floor) obj2).d));
    }
}
