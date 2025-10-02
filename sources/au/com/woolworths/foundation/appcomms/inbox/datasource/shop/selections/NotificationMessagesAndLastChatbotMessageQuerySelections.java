package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.selections;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.selections.LastChatbotMessageSelections;
import au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.selections.NotificationMessageSelections;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.LastChatbotMsg;
import au.com.woolworths.shop.graphql.type.NCMessage;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/selections/NotificationMessagesAndLastChatbotMessageQuerySelections;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessagesAndLastChatbotMessageQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8473a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("NCMessage", CollectionsKt.Q("NCMessage"));
        builder.b(NotificationMessageSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f8473a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("LastChatbotMsg", CollectionsKt.Q("LastChatbotMsg"));
        builder2.b(LastChatbotMessageSelections.f8470a);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("notificationMessages", a.f(NCMessage.f11614a));
        builder3.e = listR;
        CompiledField compiledFieldC3 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("lastChatbotMsg", CompiledGraphQL.b(LastChatbotMsg.f11512a));
        new CompiledArgument.Builder(Query.z);
        builder4.d = au.com.woolworths.android.onesite.a.v();
        builder4.e = listR2;
        c = CollectionsKt.R(compiledFieldC3, builder4.c());
    }
}
