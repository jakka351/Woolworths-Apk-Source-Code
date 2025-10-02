package au.com.woolworths.feature.shop.ask.olive.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.More;
import au.com.woolworths.shop.graphql.type.MoreFeedItem;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/ask/olive/selections/ChatbotFeedQuerySelections;", "", "ask-olive_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatbotFeedQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6613a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), d.g("url", customScalarType));
        f6613a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("MoreChat", CollectionsKt.Q("MoreChat"));
        builder.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("feed", d.j(MoreFeedItem.f11586a));
        builder2.e = listR2;
        List listQ = CollectionsKt.Q(builder2.c());
        c = listQ;
        CompiledField.Builder builder3 = new CompiledField.Builder("more", CompiledGraphQL.b(More.f11577a));
        new CompiledArgument.Builder(Query.G);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.F);
        builder3.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder3.e = listQ;
        d = CollectionsKt.Q(builder3.c());
    }
}
