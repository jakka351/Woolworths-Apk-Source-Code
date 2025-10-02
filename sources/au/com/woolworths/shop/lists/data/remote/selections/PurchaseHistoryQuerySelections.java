package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.PurchaseHistoryEvent;
import au.com.woolworths.shop.graphql.type.PurchaseHistoryList;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/PurchaseHistoryQuerySelections;", "", "<init>", "()V", "__items", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__purchaseHistoryEvent", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PurchaseHistoryQuerySelections {

    @NotNull
    public static final PurchaseHistoryQuerySelections INSTANCE = new PurchaseHistoryQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __items;

    @NotNull
    private static final List<CompiledSelection> __purchaseHistoryEvent;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        List<CompiledSelection> listR = CollectionsKt.R(new CompiledField.Builder("basketID", GraphQLID.f11441a).c(), new CompiledField.Builder("title", CompiledGraphQL.b(GraphQLString.f11443a)).c());
        __items = listR;
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("totalItemCount", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("nextPage", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("items", a.f(PurchaseHistoryEvent.f11806a));
        builder.e = listR;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC, compiledFieldG, builder.c());
        __purchaseHistoryEvent = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("purchaseHistoryEvent", PurchaseHistoryList.f11807a);
        new CompiledArgument.Builder(Query.d1);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Query.c1);
        builder2.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder2.e = listR2;
        __root = CollectionsKt.Q(builder2.c());
    }

    private PurchaseHistoryQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
