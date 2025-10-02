package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.FreeTextListItem;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.ItemsToBeSynced;
import au.com.woolworths.shop.graphql.type.ListItemDeleted;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.ProductListItem;
import au.com.woolworths.shop.graphql.type.SyncListItemsResponse;
import au.com.woolworths.shop.lists.data.remote.fragment.selections.DeletedItemFragmentSelections;
import au.com.woolworths.shop.lists.data.remote.fragment.selections.ProductItemFragmentSelections;
import au.com.woolworths.shop.lists.data.remote.fragment.selections.TextItemFragmentSelections;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/SyncListItemsMutationSelections;", "", "<init>", "()V", "__createdProductItems", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__editedProductItems", "__createdFreeTextItems", "__editedFreeTextItems", "__deletedItems", "__updatedProductItems", "__updatedFreeTextItems", "__deletedItems1", "__itemsToBeSynced", "__syncListItems", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncListItemsMutationSelections {

    @NotNull
    public static final SyncListItemsMutationSelections INSTANCE = new SyncListItemsMutationSelections();

    @NotNull
    private static final List<CompiledSelection> __createdFreeTextItems;

    @NotNull
    private static final List<CompiledSelection> __createdProductItems;

    @NotNull
    private static final List<CompiledSelection> __deletedItems;

    @NotNull
    private static final List<CompiledSelection> __deletedItems1;

    @NotNull
    private static final List<CompiledSelection> __editedFreeTextItems;

    @NotNull
    private static final List<CompiledSelection> __editedProductItems;

    @NotNull
    private static final List<CompiledSelection> __itemsToBeSynced;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __syncListItems;

    @NotNull
    private static final List<CompiledSelection> __updatedFreeTextItems;

    @NotNull
    private static final List<CompiledSelection> __updatedProductItems;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductListItem", CollectionsKt.Q("ProductListItem"));
        ProductItemFragmentSelections productItemFragmentSelections = ProductItemFragmentSelections.INSTANCE;
        builder.b(productItemFragmentSelections.get__root());
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __createdProductItems = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("ProductListItem", CollectionsKt.Q("ProductListItem"));
        builder2.b(productItemFragmentSelections.get__root());
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        __editedProductItems = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("FreeTextListItem", CollectionsKt.Q("FreeTextListItem"));
        TextItemFragmentSelections textItemFragmentSelections = TextItemFragmentSelections.INSTANCE;
        builder3.b(textItemFragmentSelections.get__root());
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC3, builder3.a());
        __createdFreeTextItems = listR3;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("FreeTextListItem", CollectionsKt.Q("FreeTextListItem"));
        builder4.b(textItemFragmentSelections.get__root());
        List<CompiledSelection> listR4 = CollectionsKt.R(compiledFieldC4, builder4.a());
        __editedFreeTextItems = listR4;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ListItemDeleted", CollectionsKt.Q("ListItemDeleted"));
        DeletedItemFragmentSelections deletedItemFragmentSelections = DeletedItemFragmentSelections.INSTANCE;
        builder5.b(deletedItemFragmentSelections.get__root());
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldC5, builder5.a());
        __deletedItems = listR5;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("ProductListItem", CollectionsKt.Q("ProductListItem"));
        builder6.b(productItemFragmentSelections.get__root());
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldC6, builder6.a());
        __updatedProductItems = listR6;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("FreeTextListItem", CollectionsKt.Q("FreeTextListItem"));
        builder7.b(textItemFragmentSelections.get__root());
        List<CompiledSelection> listR7 = CollectionsKt.R(compiledFieldC7, builder7.a());
        __updatedFreeTextItems = listR7;
        CompiledField compiledFieldC8 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder8 = new CompiledFragment.Builder("ListItemDeleted", CollectionsKt.Q("ListItemDeleted"));
        builder8.b(deletedItemFragmentSelections.get__root());
        List<CompiledSelection> listR8 = CollectionsKt.R(compiledFieldC8, builder8.a());
        __deletedItems1 = listR8;
        ObjectType objectType = ProductListItem.f11754a;
        CompiledField.Builder builder9 = new CompiledField.Builder("updatedProductItems", a.f(objectType));
        builder9.e = listR6;
        CompiledField compiledFieldC9 = builder9.c();
        ObjectType objectType2 = FreeTextListItem.f11399a;
        CompiledField.Builder builder10 = new CompiledField.Builder("updatedFreeTextItems", a.f(objectType2));
        builder10.e = listR7;
        CompiledField compiledFieldC10 = builder10.c();
        ObjectType objectType3 = ListItemDeleted.f11535a;
        CompiledField.Builder builder11 = new CompiledField.Builder("deletedItems", CompiledGraphQL.a(objectType3));
        builder11.e = listR8;
        List<CompiledSelection> listR9 = CollectionsKt.R(compiledFieldC9, compiledFieldC10, builder11.c());
        __itemsToBeSynced = listR9;
        CompiledField compiledFieldC11 = new CompiledField.Builder("timestamp", CompiledGraphQL.b(GraphQLFloat.f11440a)).c();
        CompiledField compiledFieldC12 = new CompiledField.Builder("listId", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField.Builder builder12 = new CompiledField.Builder("createdProductItems", a.f(objectType));
        builder12.e = listR;
        CompiledField compiledFieldC13 = builder12.c();
        CompiledField.Builder builder13 = new CompiledField.Builder("editedProductItems", a.f(objectType));
        builder13.e = listR2;
        CompiledField compiledFieldC14 = builder13.c();
        CompiledField.Builder builder14 = new CompiledField.Builder("createdFreeTextItems", a.f(objectType2));
        builder14.e = listR3;
        CompiledField compiledFieldC15 = builder14.c();
        CompiledField.Builder builder15 = new CompiledField.Builder("editedFreeTextItems", a.f(objectType2));
        builder15.e = listR4;
        CompiledField compiledFieldC16 = builder15.c();
        CompiledField.Builder builder16 = new CompiledField.Builder("deletedItems", a.f(objectType3));
        builder16.e = listR5;
        CompiledField compiledFieldC17 = builder16.c();
        CompiledField.Builder builder17 = new CompiledField.Builder("itemsToBeSynced", CompiledGraphQL.b(ItemsToBeSynced.f11511a));
        builder17.e = listR9;
        List<CompiledSelection> listR10 = CollectionsKt.R(compiledFieldC11, compiledFieldC12, compiledFieldC13, compiledFieldC14, compiledFieldC15, compiledFieldC16, compiledFieldC17, builder17.c());
        __syncListItems = listR10;
        CompiledField.Builder builder18 = new CompiledField.Builder("syncListItems", CompiledGraphQL.b(SyncListItemsResponse.f11955a));
        new CompiledArgument.Builder(Mutation.j);
        builder18.d = au.com.woolworths.android.onesite.a.v();
        builder18.e = listR10;
        __root = CollectionsKt.Q(builder18.c());
    }

    private SyncListItemsMutationSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
