package au.com.woolworths.shop.lists.data.remote.fragment.selections;

import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/fragment/selections/TextItemFragmentSelections;", "", "<init>", "()V", "__root", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextItemFragmentSelections {

    @NotNull
    public static final TextItemFragmentSelections INSTANCE = new TextItemFragmentSelections();

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("timestamp", CompiledGraphQL.b(GraphQLFloat.f11440a)).c();
        CustomScalarType customScalarType = GraphQLID.f11441a;
        __root = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("referenceId", customScalarType).c(), new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(GraphQLString.f11443a)).c(), new CompiledField.Builder("checked", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
    }

    private TextItemFragmentSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
