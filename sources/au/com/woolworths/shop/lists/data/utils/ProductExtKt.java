package au.com.woolworths.shop.lists.data.utils;

import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCategory;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.shop.lists.data.entity.CategoryByProductEntity;
import au.com.woolworths.shop.lists.data.entity.ProductEntity;
import au.com.woolworths.shop.lists.data.entity.ProductsWithCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductExtKt {
    public static final ProductEntity a(ProductCard productCard) {
        Intrinsics.h(productCard, "<this>");
        ProductId productIdCreate = ProductId.INSTANCE.create(productCard.getProductId());
        String name = productCard.getName();
        String productImage = productCard.getProductImage();
        String badgeImage = productCard.getBadgeImage();
        Integer price = productCard.getPrice();
        String unitPriceDescription = productCard.getUnitPriceDescription();
        boolean zIsAvailable = productCard.isAvailable();
        String wasPrice = productCard.getWasPrice();
        String multiBuyPrice = productCard.getMultiBuyPrice();
        String multiBuyUnitPrice = productCard.getMultiBuyUnitPrice();
        String purchaseWarning = productCard.getPurchaseWarning();
        ProductShoppingList productShoppingList = productCard.getProductShoppingList();
        InstoreDetailsData inStoreDetails = productCard.getInStoreDetails();
        InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
        List<ProductInlineLabelApiData> inlineLabels = productCard.getInlineLabels();
        PromotionInfo promotionInfo = productCard.getPromotionInfo();
        if (promotionInfo == null) {
            String promotionValue = productCard.getPromotionValue();
            String promotionType = productCard.getPromotionType();
            promotionInfo = (promotionValue == null || promotionType == null) ? null : new PromotionInfo(ProductPromotionTypes.valueOf(promotionType), promotionValue);
        }
        ProductEntity productEntity = new ProductEntity(productIdCreate, name, productImage, badgeImage, price, unitPriceDescription, zIsAvailable, wasPrice, multiBuyPrice, multiBuyUnitPrice, purchaseWarning, productShoppingList, inStoreDetails, inlineLabels, promotionInfo, productCard.getRewardsOfferInfo(), productCard.getDisclaimer(), productCard.getTagLabel(), inStoreAvailabilityInfo, productCard.getMarketplace(), Boolean.valueOf(productCard.isTobacco()), productCard.getSource(), productCard.getMultiBuyPriceInfo(), productCard.getMemberPriceInfo(), productCard.getInStoreLocation());
        productEntity.setCategories(productCard.getCategories());
        return productEntity;
    }

    public static final ProductCard b(ProductsWithCategory productsWithCategory) {
        ProductPromotionTypes type;
        String value = productsWithCategory.getProductEntity().getProductId().getValue();
        String name = productsWithCategory.getProductEntity().getName();
        String productImage = productsWithCategory.getProductEntity().getProductImage();
        String badgeImage = productsWithCategory.getProductEntity().getBadgeImage();
        Integer price = productsWithCategory.getProductEntity().getPrice();
        String unitPriceDescription = productsWithCategory.getProductEntity().getUnitPriceDescription();
        PromotionInfo promotionInfo = productsWithCategory.getProductEntity().getPromotionInfo();
        String strName = null;
        String label = promotionInfo != null ? promotionInfo.getLabel() : null;
        PromotionInfo promotionInfo2 = productsWithCategory.getProductEntity().getPromotionInfo();
        if (promotionInfo2 != null && (type = promotionInfo2.getType()) != null) {
            strName = type.name();
        }
        String str = strName;
        boolean zIsAvailable = productsWithCategory.getProductEntity().isAvailable();
        String wasPrice = productsWithCategory.getProductEntity().getWasPrice();
        String multiBuyPrice = productsWithCategory.getProductEntity().getMultiBuyPrice();
        String multiBuyUnitPrice = productsWithCategory.getProductEntity().getMultiBuyUnitPrice();
        String purchaseWarning = productsWithCategory.getProductEntity().getPurchaseWarning();
        InstoreDetailsData inStoreDetails = productsWithCategory.getProductEntity().getInStoreDetails();
        ProductShoppingList productShoppingList = productsWithCategory.getProductEntity().getProductShoppingList();
        List<ProductInlineLabelApiData> inlineLabels = productsWithCategory.getProductEntity().getInlineLabels();
        PromotionInfo promotionInfo3 = productsWithCategory.getProductEntity().getPromotionInfo();
        ProductListMarketplace marketplace = productsWithCategory.getProductEntity().getMarketplace();
        RewardsOfferInfo rewardsOfferInfo = productsWithCategory.getProductEntity().getRewardsOfferInfo();
        String disclaimer = productsWithCategory.getProductEntity().getDisclaimer();
        TagLabel tagLabel = productsWithCategory.getProductEntity().getTagLabel();
        InStoreAvailabilityInfo inStoreAvailabilityInfo = productsWithCategory.getProductEntity().getInStoreAvailabilityInfo();
        List<CategoryByProductEntity> categories = productsWithCategory.getCategories();
        Intrinsics.h(categories, "<this>");
        List<CategoryByProductEntity> list = categories;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            CategoryByProductEntity categoryByProductEntity = (CategoryByProductEntity) it.next();
            arrayList.add(new ProductCategory(categoryByProductEntity.getName(), Integer.valueOf(categoryByProductEntity.getCategoryLevel())));
        }
        Boolean boolIsTobacco = productsWithCategory.getProductEntity().isTobacco();
        return new ProductCard(value, name, productImage, badgeImage, price, null, label, str, unitPriceDescription, zIsAvailable, false, wasPrice, multiBuyPrice, multiBuyUnitPrice, purchaseWarning, null, null, productShoppingList, inStoreDetails, null, inlineLabels, promotionInfo3, null, productsWithCategory.getProductEntity().getSource(), marketplace, rewardsOfferInfo, disclaimer, tagLabel, inStoreAvailabilityInfo, null, arrayList, boolIsTobacco != null ? boolIsTobacco.booleanValue() : false, productsWithCategory.getProductEntity().getMultiBuyPriceInfo(), productsWithCategory.getProductEntity().getMemberPriceInfo(), null, productsWithCategory.getProductEntity().getInStoreLocationData(), null, null, null, null, 65568, 244, null);
    }

    public static final ArrayList c(List list) {
        CategoryByProductEntity categoryByProductEntity;
        Intrinsics.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            ProductCard productCard = (ProductCard) it.next();
            Intrinsics.h(productCard, "<this>");
            List<ProductCategory> categories = productCard.getCategories();
            if (categories != null) {
                ArrayList arrayList3 = new ArrayList();
                for (ProductCategory productCategory : categories) {
                    if (productCategory.getName() == null || productCategory.getCategoryLevel() == null) {
                        categoryByProductEntity = null;
                    } else {
                        ProductId productIdCreate = ProductId.INSTANCE.create(productCard.getProductId());
                        String name = productCategory.getName();
                        Intrinsics.e(name);
                        Integer categoryLevel = productCategory.getCategoryLevel();
                        Intrinsics.e(categoryLevel);
                        categoryByProductEntity = new CategoryByProductEntity(0L, productIdCreate, name, categoryLevel.intValue(), 1, null);
                    }
                    if (categoryByProductEntity != null) {
                        arrayList3.add(categoryByProductEntity);
                    }
                }
                arrayList2 = arrayList3;
            }
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
