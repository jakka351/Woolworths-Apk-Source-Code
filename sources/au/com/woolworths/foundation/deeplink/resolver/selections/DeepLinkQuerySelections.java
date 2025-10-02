package au.com.woolworths.foundation.deeplink.resolver.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/deeplink/resolver/selections/DeepLinkQuerySelections;", "", "deeplink-resolver_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeepLinkQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8490a;

    static {
        CompiledField.Builder builder = new CompiledField.Builder("deepLink", GraphQLString.f11443a);
        new CompiledArgument.Builder(Query.k);
        builder.d = a.v();
        f8490a = CollectionsKt.Q(builder.c());
    }
}
