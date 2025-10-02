package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.selections;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.selections.NotificationMessageSelections;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.NCMessage;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/selections/NotificationMessagesQuerySelections;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessagesQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8474a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f11443a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("NCMessage", CollectionsKt.Q("NCMessage"));
        builder.b(NotificationMessageSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f8474a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("notificationMessages", a.f(NCMessage.f11614a));
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
