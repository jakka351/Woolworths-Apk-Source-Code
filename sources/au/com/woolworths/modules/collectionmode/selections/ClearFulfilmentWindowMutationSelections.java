package au.com.woolworths.modules.collectionmode.selections;

import au.com.woolworths.shop.graphql.type.ClearFulfilmentWindowStateResultSuccess;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/modules/collectionmode/selections/ClearFulfilmentWindowMutationSelections;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClearFulfilmentWindowMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9160a;
    public static final List b;

    static {
        List listQ = CollectionsKt.Q(new CompiledField.Builder("_", GraphQLBoolean.f11439a).c());
        f9160a = listQ;
        CompiledField.Builder builder = new CompiledField.Builder("clearFulfilmentWindowState", ClearFulfilmentWindowStateResultSuccess.f11273a);
        builder.e = listQ;
        b = CollectionsKt.Q(builder.c());
    }
}
