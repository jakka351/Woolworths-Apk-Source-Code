package fragment.selections;

import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/selections/RatingsAndReviewsPreviewHeaderSelections;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsPreviewHeaderSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23834a;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        f23834a = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c());
    }
}
