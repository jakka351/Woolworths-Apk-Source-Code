package au.com.woolworths.shop.lists.data.remote;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.shop.graphql.type.SyncListItemsInput;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListItemsMutation_ResponseAdapter;
import au.com.woolworths.shop.lists.data.remote.adapter.SyncListItemsMutation_VariablesAdapter;
import au.com.woolworths.shop.lists.data.remote.fragment.DeletedItemFragment;
import au.com.woolworths.shop.lists.data.remote.fragment.ProductItemFragment;
import au.com.woolworths.shop.lists.data.remote.fragment.TextItemFragment;
import au.com.woolworths.shop.lists.data.remote.selections.SyncListItemsMutationSelections;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\f!\"#$%&'()*+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006-"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$Data;", "syncListItemsInput", "Lau/com/woolworths/shop/graphql/type/SyncListItemsInput;", "<init>", "(Lau/com/woolworths/shop/graphql/type/SyncListItemsInput;)V", "getSyncListItemsInput", "()Lau/com/woolworths/shop/graphql/type/SyncListItemsInput;", "id", "", "document", AppMeasurementSdk.ConditionalUserProperty.NAME, "serializeVariables", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "withDefaultValues", "", "adapter", "Lcom/apollographql/apollo/api/Adapter;", "rootField", "Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Data", SyncListItemsMutation.OPERATION_NAME, "CreatedProductItem", "EditedProductItem", "CreatedFreeTextItem", "EditedFreeTextItem", "DeletedItem", "ItemsToBeSynced", "UpdatedProductItem", "UpdatedFreeTextItem", "DeletedItem1", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SyncListItemsMutation implements Mutation<Data> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OPERATION_ID = "c28ef761736bd31734ba7d98cf17171e1dff4ece8642f983fdc842c14f65e47f";

    @NotNull
    public static final String OPERATION_NAME = "SyncListItems";

    @NotNull
    private final SyncListItemsInput syncListItemsInput;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$Companion;", "", "<init>", "()V", "OPERATION_ID", "", "OPERATION_DOCUMENT", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_NAME", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getOPERATION_DOCUMENT() {
            return "mutation SyncListItems($syncListItemsInput: SyncListItemsInput!) { syncListItems(syncListItemsInput: $syncListItemsInput) { timestamp listId createdProductItems { __typename ...productItemFragment } editedProductItems { __typename ...productItemFragment } createdFreeTextItems { __typename ...textItemFragment } editedFreeTextItems { __typename ...textItemFragment } deletedItems { __typename ...deletedItemFragment } itemsToBeSynced { updatedProductItems { __typename ...productItemFragment } updatedFreeTextItems { __typename ...textItemFragment } deletedItems { __typename ...deletedItemFragment } } } }  fragment productItemFragment on ProductListItem { timestamp id productId quantity checked }  fragment textItemFragment on FreeTextListItem { timestamp referenceId id text checked }  fragment deletedItemFragment on ListItemDeleted { timestamp id }";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$CreatedFreeTextItem;", "", "__typename", "", "textItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getTextItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreatedFreeTextItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final TextItemFragment textItemFragment;

        public CreatedFreeTextItem(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            this.__typename = __typename;
            this.textItemFragment = textItemFragment;
        }

        public static /* synthetic */ CreatedFreeTextItem copy$default(CreatedFreeTextItem createdFreeTextItem, String str, TextItemFragment textItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = createdFreeTextItem.__typename;
            }
            if ((i & 2) != 0) {
                textItemFragment = createdFreeTextItem.textItemFragment;
            }
            return createdFreeTextItem.copy(str, textItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final CreatedFreeTextItem copy(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            return new CreatedFreeTextItem(__typename, textItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreatedFreeTextItem)) {
                return false;
            }
            CreatedFreeTextItem createdFreeTextItem = (CreatedFreeTextItem) other;
            return Intrinsics.c(this.__typename, createdFreeTextItem.__typename) && Intrinsics.c(this.textItemFragment, createdFreeTextItem.textItemFragment);
        }

        @NotNull
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.textItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CreatedFreeTextItem(__typename=" + this.__typename + ", textItemFragment=" + this.textItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$CreatedProductItem;", "", "__typename", "", "productItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getProductItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreatedProductItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductItemFragment productItemFragment;

        public CreatedProductItem(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            this.__typename = __typename;
            this.productItemFragment = productItemFragment;
        }

        public static /* synthetic */ CreatedProductItem copy$default(CreatedProductItem createdProductItem, String str, ProductItemFragment productItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = createdProductItem.__typename;
            }
            if ((i & 2) != 0) {
                productItemFragment = createdProductItem.productItemFragment;
            }
            return createdProductItem.copy(str, productItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final CreatedProductItem copy(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            return new CreatedProductItem(__typename, productItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreatedProductItem)) {
                return false;
            }
            CreatedProductItem createdProductItem = (CreatedProductItem) other;
            return Intrinsics.c(this.__typename, createdProductItem.__typename) && Intrinsics.c(this.productItemFragment, createdProductItem.productItemFragment);
        }

        @NotNull
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.productItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CreatedProductItem(__typename=" + this.__typename + ", productItemFragment=" + this.productItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "syncListItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$SyncListItems;", "<init>", "(Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$SyncListItems;)V", "getSyncListItems", "()Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$SyncListItems;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        @NotNull
        private final SyncListItems syncListItems;

        public Data(@NotNull SyncListItems syncListItems) {
            Intrinsics.h(syncListItems, "syncListItems");
            this.syncListItems = syncListItems;
        }

        public static /* synthetic */ Data copy$default(Data data, SyncListItems syncListItems, int i, Object obj) {
            if ((i & 1) != 0) {
                syncListItems = data.syncListItems;
            }
            return data.copy(syncListItems);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SyncListItems getSyncListItems() {
            return this.syncListItems;
        }

        @NotNull
        public final Data copy(@NotNull SyncListItems syncListItems) {
            Intrinsics.h(syncListItems, "syncListItems");
            return new Data(syncListItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.c(this.syncListItems, ((Data) other).syncListItems);
        }

        @NotNull
        public final SyncListItems getSyncListItems() {
            return this.syncListItems;
        }

        public int hashCode() {
            return this.syncListItems.hashCode();
        }

        @NotNull
        public String toString() {
            return "Data(syncListItems=" + this.syncListItems + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$DeletedItem;", "", "__typename", "", "deletedItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getDeletedItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeletedItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final DeletedItemFragment deletedItemFragment;

        public DeletedItem(@NotNull String __typename, @NotNull DeletedItemFragment deletedItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(deletedItemFragment, "deletedItemFragment");
            this.__typename = __typename;
            this.deletedItemFragment = deletedItemFragment;
        }

        public static /* synthetic */ DeletedItem copy$default(DeletedItem deletedItem, String str, DeletedItemFragment deletedItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deletedItem.__typename;
            }
            if ((i & 2) != 0) {
                deletedItemFragment = deletedItem.deletedItemFragment;
            }
            return deletedItem.copy(str, deletedItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DeletedItemFragment getDeletedItemFragment() {
            return this.deletedItemFragment;
        }

        @NotNull
        public final DeletedItem copy(@NotNull String __typename, @NotNull DeletedItemFragment deletedItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(deletedItemFragment, "deletedItemFragment");
            return new DeletedItem(__typename, deletedItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeletedItem)) {
                return false;
            }
            DeletedItem deletedItem = (DeletedItem) other;
            return Intrinsics.c(this.__typename, deletedItem.__typename) && Intrinsics.c(this.deletedItemFragment, deletedItem.deletedItemFragment);
        }

        @NotNull
        public final DeletedItemFragment getDeletedItemFragment() {
            return this.deletedItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.deletedItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DeletedItem(__typename=" + this.__typename + ", deletedItemFragment=" + this.deletedItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$DeletedItem1;", "", "__typename", "", "deletedItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getDeletedItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/DeletedItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeletedItem1 {

        @NotNull
        private final String __typename;

        @NotNull
        private final DeletedItemFragment deletedItemFragment;

        public DeletedItem1(@NotNull String __typename, @NotNull DeletedItemFragment deletedItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(deletedItemFragment, "deletedItemFragment");
            this.__typename = __typename;
            this.deletedItemFragment = deletedItemFragment;
        }

        public static /* synthetic */ DeletedItem1 copy$default(DeletedItem1 deletedItem1, String str, DeletedItemFragment deletedItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deletedItem1.__typename;
            }
            if ((i & 2) != 0) {
                deletedItemFragment = deletedItem1.deletedItemFragment;
            }
            return deletedItem1.copy(str, deletedItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DeletedItemFragment getDeletedItemFragment() {
            return this.deletedItemFragment;
        }

        @NotNull
        public final DeletedItem1 copy(@NotNull String __typename, @NotNull DeletedItemFragment deletedItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(deletedItemFragment, "deletedItemFragment");
            return new DeletedItem1(__typename, deletedItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeletedItem1)) {
                return false;
            }
            DeletedItem1 deletedItem1 = (DeletedItem1) other;
            return Intrinsics.c(this.__typename, deletedItem1.__typename) && Intrinsics.c(this.deletedItemFragment, deletedItem1.deletedItemFragment);
        }

        @NotNull
        public final DeletedItemFragment getDeletedItemFragment() {
            return this.deletedItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.deletedItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DeletedItem1(__typename=" + this.__typename + ", deletedItemFragment=" + this.deletedItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$EditedFreeTextItem;", "", "__typename", "", "textItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getTextItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditedFreeTextItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final TextItemFragment textItemFragment;

        public EditedFreeTextItem(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            this.__typename = __typename;
            this.textItemFragment = textItemFragment;
        }

        public static /* synthetic */ EditedFreeTextItem copy$default(EditedFreeTextItem editedFreeTextItem, String str, TextItemFragment textItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editedFreeTextItem.__typename;
            }
            if ((i & 2) != 0) {
                textItemFragment = editedFreeTextItem.textItemFragment;
            }
            return editedFreeTextItem.copy(str, textItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final EditedFreeTextItem copy(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            return new EditedFreeTextItem(__typename, textItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditedFreeTextItem)) {
                return false;
            }
            EditedFreeTextItem editedFreeTextItem = (EditedFreeTextItem) other;
            return Intrinsics.c(this.__typename, editedFreeTextItem.__typename) && Intrinsics.c(this.textItemFragment, editedFreeTextItem.textItemFragment);
        }

        @NotNull
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.textItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "EditedFreeTextItem(__typename=" + this.__typename + ", textItemFragment=" + this.textItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$EditedProductItem;", "", "__typename", "", "productItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getProductItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditedProductItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductItemFragment productItemFragment;

        public EditedProductItem(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            this.__typename = __typename;
            this.productItemFragment = productItemFragment;
        }

        public static /* synthetic */ EditedProductItem copy$default(EditedProductItem editedProductItem, String str, ProductItemFragment productItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editedProductItem.__typename;
            }
            if ((i & 2) != 0) {
                productItemFragment = editedProductItem.productItemFragment;
            }
            return editedProductItem.copy(str, productItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final EditedProductItem copy(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            return new EditedProductItem(__typename, productItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditedProductItem)) {
                return false;
            }
            EditedProductItem editedProductItem = (EditedProductItem) other;
            return Intrinsics.c(this.__typename, editedProductItem.__typename) && Intrinsics.c(this.productItemFragment, editedProductItem.productItemFragment);
        }

        @NotNull
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.productItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "EditedProductItem(__typename=" + this.__typename + ", productItemFragment=" + this.productItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003HÆ\u0003J=\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$ItemsToBeSynced;", "", "updatedProductItems", "", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$UpdatedProductItem;", "updatedFreeTextItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$UpdatedFreeTextItem;", "deletedItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$DeletedItem1;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getUpdatedProductItems", "()Ljava/util/List;", "getUpdatedFreeTextItems", "getDeletedItems", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ItemsToBeSynced {

        @Nullable
        private final List<DeletedItem1> deletedItems;

        @NotNull
        private final List<UpdatedFreeTextItem> updatedFreeTextItems;

        @NotNull
        private final List<UpdatedProductItem> updatedProductItems;

        public ItemsToBeSynced(@NotNull List<UpdatedProductItem> updatedProductItems, @NotNull List<UpdatedFreeTextItem> updatedFreeTextItems, @Nullable List<DeletedItem1> list) {
            Intrinsics.h(updatedProductItems, "updatedProductItems");
            Intrinsics.h(updatedFreeTextItems, "updatedFreeTextItems");
            this.updatedProductItems = updatedProductItems;
            this.updatedFreeTextItems = updatedFreeTextItems;
            this.deletedItems = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemsToBeSynced copy$default(ItemsToBeSynced itemsToBeSynced, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = itemsToBeSynced.updatedProductItems;
            }
            if ((i & 2) != 0) {
                list2 = itemsToBeSynced.updatedFreeTextItems;
            }
            if ((i & 4) != 0) {
                list3 = itemsToBeSynced.deletedItems;
            }
            return itemsToBeSynced.copy(list, list2, list3);
        }

        @NotNull
        public final List<UpdatedProductItem> component1() {
            return this.updatedProductItems;
        }

        @NotNull
        public final List<UpdatedFreeTextItem> component2() {
            return this.updatedFreeTextItems;
        }

        @Nullable
        public final List<DeletedItem1> component3() {
            return this.deletedItems;
        }

        @NotNull
        public final ItemsToBeSynced copy(@NotNull List<UpdatedProductItem> updatedProductItems, @NotNull List<UpdatedFreeTextItem> updatedFreeTextItems, @Nullable List<DeletedItem1> deletedItems) {
            Intrinsics.h(updatedProductItems, "updatedProductItems");
            Intrinsics.h(updatedFreeTextItems, "updatedFreeTextItems");
            return new ItemsToBeSynced(updatedProductItems, updatedFreeTextItems, deletedItems);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemsToBeSynced)) {
                return false;
            }
            ItemsToBeSynced itemsToBeSynced = (ItemsToBeSynced) other;
            return Intrinsics.c(this.updatedProductItems, itemsToBeSynced.updatedProductItems) && Intrinsics.c(this.updatedFreeTextItems, itemsToBeSynced.updatedFreeTextItems) && Intrinsics.c(this.deletedItems, itemsToBeSynced.deletedItems);
        }

        @Nullable
        public final List<DeletedItem1> getDeletedItems() {
            return this.deletedItems;
        }

        @NotNull
        public final List<UpdatedFreeTextItem> getUpdatedFreeTextItems() {
            return this.updatedFreeTextItems;
        }

        @NotNull
        public final List<UpdatedProductItem> getUpdatedProductItems() {
            return this.updatedProductItems;
        }

        public int hashCode() {
            int iD = b.d(this.updatedProductItems.hashCode() * 31, 31, this.updatedFreeTextItems);
            List<DeletedItem1> list = this.deletedItems;
            return iD + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            List<UpdatedProductItem> list = this.updatedProductItems;
            List<UpdatedFreeTextItem> list2 = this.updatedFreeTextItems;
            List<DeletedItem1> list3 = this.deletedItems;
            StringBuilder sb = new StringBuilder("ItemsToBeSynced(updatedProductItems=");
            sb.append(list);
            sb.append(", updatedFreeTextItems=");
            sb.append(list2);
            sb.append(", deletedItems=");
            return a.t(sb, list3, ")");
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0012HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$SyncListItems;", "", "timestamp", "", "listId", "", "createdProductItems", "", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$CreatedProductItem;", "editedProductItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$EditedProductItem;", "createdFreeTextItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$CreatedFreeTextItem;", "editedFreeTextItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$EditedFreeTextItem;", "deletedItems", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$DeletedItem;", "itemsToBeSynced", "Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$ItemsToBeSynced;", "<init>", "(DLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$ItemsToBeSynced;)V", "getTimestamp", "()D", "getListId", "()Ljava/lang/String;", "getCreatedProductItems", "()Ljava/util/List;", "getEditedProductItems", "getCreatedFreeTextItems", "getEditedFreeTextItems", "getDeletedItems", "getItemsToBeSynced", "()Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$ItemsToBeSynced;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SyncListItems {

        @NotNull
        private final List<CreatedFreeTextItem> createdFreeTextItems;

        @NotNull
        private final List<CreatedProductItem> createdProductItems;

        @NotNull
        private final List<DeletedItem> deletedItems;

        @NotNull
        private final List<EditedFreeTextItem> editedFreeTextItems;

        @NotNull
        private final List<EditedProductItem> editedProductItems;

        @NotNull
        private final ItemsToBeSynced itemsToBeSynced;

        @NotNull
        private final String listId;
        private final double timestamp;

        public SyncListItems(double d, @NotNull String listId, @NotNull List<CreatedProductItem> createdProductItems, @NotNull List<EditedProductItem> editedProductItems, @NotNull List<CreatedFreeTextItem> createdFreeTextItems, @NotNull List<EditedFreeTextItem> editedFreeTextItems, @NotNull List<DeletedItem> deletedItems, @NotNull ItemsToBeSynced itemsToBeSynced) {
            Intrinsics.h(listId, "listId");
            Intrinsics.h(createdProductItems, "createdProductItems");
            Intrinsics.h(editedProductItems, "editedProductItems");
            Intrinsics.h(createdFreeTextItems, "createdFreeTextItems");
            Intrinsics.h(editedFreeTextItems, "editedFreeTextItems");
            Intrinsics.h(deletedItems, "deletedItems");
            Intrinsics.h(itemsToBeSynced, "itemsToBeSynced");
            this.timestamp = d;
            this.listId = listId;
            this.createdProductItems = createdProductItems;
            this.editedProductItems = editedProductItems;
            this.createdFreeTextItems = createdFreeTextItems;
            this.editedFreeTextItems = editedFreeTextItems;
            this.deletedItems = deletedItems;
            this.itemsToBeSynced = itemsToBeSynced;
        }

        public static /* synthetic */ SyncListItems copy$default(SyncListItems syncListItems, double d, String str, List list, List list2, List list3, List list4, List list5, ItemsToBeSynced itemsToBeSynced, int i, Object obj) {
            if ((i & 1) != 0) {
                d = syncListItems.timestamp;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                str = syncListItems.listId;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                list = syncListItems.createdProductItems;
            }
            List list6 = list;
            if ((i & 8) != 0) {
                list2 = syncListItems.editedProductItems;
            }
            return syncListItems.copy(d2, str2, list6, list2, (i & 16) != 0 ? syncListItems.createdFreeTextItems : list3, (i & 32) != 0 ? syncListItems.editedFreeTextItems : list4, (i & 64) != 0 ? syncListItems.deletedItems : list5, (i & 128) != 0 ? syncListItems.itemsToBeSynced : itemsToBeSynced);
        }

        /* renamed from: component1, reason: from getter */
        public final double getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getListId() {
            return this.listId;
        }

        @NotNull
        public final List<CreatedProductItem> component3() {
            return this.createdProductItems;
        }

        @NotNull
        public final List<EditedProductItem> component4() {
            return this.editedProductItems;
        }

        @NotNull
        public final List<CreatedFreeTextItem> component5() {
            return this.createdFreeTextItems;
        }

        @NotNull
        public final List<EditedFreeTextItem> component6() {
            return this.editedFreeTextItems;
        }

        @NotNull
        public final List<DeletedItem> component7() {
            return this.deletedItems;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final ItemsToBeSynced getItemsToBeSynced() {
            return this.itemsToBeSynced;
        }

        @NotNull
        public final SyncListItems copy(double timestamp, @NotNull String listId, @NotNull List<CreatedProductItem> createdProductItems, @NotNull List<EditedProductItem> editedProductItems, @NotNull List<CreatedFreeTextItem> createdFreeTextItems, @NotNull List<EditedFreeTextItem> editedFreeTextItems, @NotNull List<DeletedItem> deletedItems, @NotNull ItemsToBeSynced itemsToBeSynced) {
            Intrinsics.h(listId, "listId");
            Intrinsics.h(createdProductItems, "createdProductItems");
            Intrinsics.h(editedProductItems, "editedProductItems");
            Intrinsics.h(createdFreeTextItems, "createdFreeTextItems");
            Intrinsics.h(editedFreeTextItems, "editedFreeTextItems");
            Intrinsics.h(deletedItems, "deletedItems");
            Intrinsics.h(itemsToBeSynced, "itemsToBeSynced");
            return new SyncListItems(timestamp, listId, createdProductItems, editedProductItems, createdFreeTextItems, editedFreeTextItems, deletedItems, itemsToBeSynced);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SyncListItems)) {
                return false;
            }
            SyncListItems syncListItems = (SyncListItems) other;
            return Double.compare(this.timestamp, syncListItems.timestamp) == 0 && Intrinsics.c(this.listId, syncListItems.listId) && Intrinsics.c(this.createdProductItems, syncListItems.createdProductItems) && Intrinsics.c(this.editedProductItems, syncListItems.editedProductItems) && Intrinsics.c(this.createdFreeTextItems, syncListItems.createdFreeTextItems) && Intrinsics.c(this.editedFreeTextItems, syncListItems.editedFreeTextItems) && Intrinsics.c(this.deletedItems, syncListItems.deletedItems) && Intrinsics.c(this.itemsToBeSynced, syncListItems.itemsToBeSynced);
        }

        @NotNull
        public final List<CreatedFreeTextItem> getCreatedFreeTextItems() {
            return this.createdFreeTextItems;
        }

        @NotNull
        public final List<CreatedProductItem> getCreatedProductItems() {
            return this.createdProductItems;
        }

        @NotNull
        public final List<DeletedItem> getDeletedItems() {
            return this.deletedItems;
        }

        @NotNull
        public final List<EditedFreeTextItem> getEditedFreeTextItems() {
            return this.editedFreeTextItems;
        }

        @NotNull
        public final List<EditedProductItem> getEditedProductItems() {
            return this.editedProductItems;
        }

        @NotNull
        public final ItemsToBeSynced getItemsToBeSynced() {
            return this.itemsToBeSynced;
        }

        @NotNull
        public final String getListId() {
            return this.listId;
        }

        public final double getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.itemsToBeSynced.hashCode() + b.d(b.d(b.d(b.d(b.d(b.c(Double.hashCode(this.timestamp) * 31, 31, this.listId), 31, this.createdProductItems), 31, this.editedProductItems), 31, this.createdFreeTextItems), 31, this.editedFreeTextItems), 31, this.deletedItems);
        }

        @NotNull
        public String toString() {
            return "SyncListItems(timestamp=" + this.timestamp + ", listId=" + this.listId + ", createdProductItems=" + this.createdProductItems + ", editedProductItems=" + this.editedProductItems + ", createdFreeTextItems=" + this.createdFreeTextItems + ", editedFreeTextItems=" + this.editedFreeTextItems + ", deletedItems=" + this.deletedItems + ", itemsToBeSynced=" + this.itemsToBeSynced + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$UpdatedFreeTextItem;", "", "__typename", "", "textItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getTextItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/TextItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedFreeTextItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final TextItemFragment textItemFragment;

        public UpdatedFreeTextItem(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            this.__typename = __typename;
            this.textItemFragment = textItemFragment;
        }

        public static /* synthetic */ UpdatedFreeTextItem copy$default(UpdatedFreeTextItem updatedFreeTextItem, String str, TextItemFragment textItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updatedFreeTextItem.__typename;
            }
            if ((i & 2) != 0) {
                textItemFragment = updatedFreeTextItem.textItemFragment;
            }
            return updatedFreeTextItem.copy(str, textItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final UpdatedFreeTextItem copy(@NotNull String __typename, @NotNull TextItemFragment textItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(textItemFragment, "textItemFragment");
            return new UpdatedFreeTextItem(__typename, textItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedFreeTextItem)) {
                return false;
            }
            UpdatedFreeTextItem updatedFreeTextItem = (UpdatedFreeTextItem) other;
            return Intrinsics.c(this.__typename, updatedFreeTextItem.__typename) && Intrinsics.c(this.textItemFragment, updatedFreeTextItem.textItemFragment);
        }

        @NotNull
        public final TextItemFragment getTextItemFragment() {
            return this.textItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.textItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdatedFreeTextItem(__typename=" + this.__typename + ", textItemFragment=" + this.textItemFragment + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/SyncListItemsMutation$UpdatedProductItem;", "", "__typename", "", "productItemFragment", "Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;)V", "get__typename", "()Ljava/lang/String;", "getProductItemFragment", "()Lau/com/woolworths/shop/lists/data/remote/fragment/ProductItemFragment;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatedProductItem {

        @NotNull
        private final String __typename;

        @NotNull
        private final ProductItemFragment productItemFragment;

        public UpdatedProductItem(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            this.__typename = __typename;
            this.productItemFragment = productItemFragment;
        }

        public static /* synthetic */ UpdatedProductItem copy$default(UpdatedProductItem updatedProductItem, String str, ProductItemFragment productItemFragment, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updatedProductItem.__typename;
            }
            if ((i & 2) != 0) {
                productItemFragment = updatedProductItem.productItemFragment;
            }
            return updatedProductItem.copy(str, productItemFragment);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final UpdatedProductItem copy(@NotNull String __typename, @NotNull ProductItemFragment productItemFragment) {
            Intrinsics.h(__typename, "__typename");
            Intrinsics.h(productItemFragment, "productItemFragment");
            return new UpdatedProductItem(__typename, productItemFragment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatedProductItem)) {
                return false;
            }
            UpdatedProductItem updatedProductItem = (UpdatedProductItem) other;
            return Intrinsics.c(this.__typename, updatedProductItem.__typename) && Intrinsics.c(this.productItemFragment, updatedProductItem.productItemFragment);
        }

        @NotNull
        public final ProductItemFragment getProductItemFragment() {
            return this.productItemFragment;
        }

        @NotNull
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return this.productItemFragment.hashCode() + (this.__typename.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdatedProductItem(__typename=" + this.__typename + ", productItemFragment=" + this.productItemFragment + ")";
        }
    }

    public SyncListItemsMutation(@NotNull SyncListItemsInput syncListItemsInput) {
        Intrinsics.h(syncListItemsInput, "syncListItemsInput");
        this.syncListItemsInput = syncListItemsInput;
    }

    public static /* synthetic */ SyncListItemsMutation copy$default(SyncListItemsMutation syncListItemsMutation, SyncListItemsInput syncListItemsInput, int i, Object obj) {
        if ((i & 1) != 0) {
            syncListItemsInput = syncListItemsMutation.syncListItemsInput;
        }
        return syncListItemsMutation.copy(syncListItemsInput);
    }

    @Override // com.apollographql.apollo.api.Executable
    @NotNull
    public Adapter<Data> adapter() {
        return Adapters.c(SyncListItemsMutation_ResponseAdapter.Data.INSTANCE, false);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SyncListItemsInput getSyncListItemsInput() {
        return this.syncListItemsInput;
    }

    @NotNull
    public final SyncListItemsMutation copy(@NotNull SyncListItemsInput syncListItemsInput) {
        Intrinsics.h(syncListItemsInput, "syncListItemsInput");
        return new SyncListItemsMutation(syncListItemsInput);
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SyncListItemsMutation) && Intrinsics.c(this.syncListItemsInput, ((SyncListItemsMutation) other).syncListItemsInput);
    }

    @NotNull
    public final SyncListItemsInput getSyncListItemsInput() {
        return this.syncListItemsInput;
    }

    public int hashCode() {
        return this.syncListItemsInput.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    @NotNull
    public String name() {
        return OPERATION_NAME;
    }

    @NotNull
    public CompiledField rootField() {
        CompiledField.Builder builder = new CompiledField.Builder("data", au.com.woolworths.shop.graphql.type.Mutation.G0);
        builder.e(SyncListItemsMutationSelections.INSTANCE.get__root());
        return builder.c();
    }

    @Override // com.apollographql.apollo.api.Executable
    public void serializeVariables(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        SyncListItemsMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @NotNull
    public String toString() {
        return "SyncListItemsMutation(syncListItemsInput=" + this.syncListItemsInput + ")";
    }
}
