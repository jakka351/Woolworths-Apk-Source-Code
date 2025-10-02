package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.selections;

import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/selections/LastChatbotMessageSelections;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastChatbotMessageSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8470a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f8470a = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("body", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("source", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("unreadChatbotMsgCount", CompiledGraphQL.b(GraphQLInt.f11442a)).c());
    }
}
