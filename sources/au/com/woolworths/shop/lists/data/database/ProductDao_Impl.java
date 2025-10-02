package au.com.woolworths.shop.lists.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.products.models.ProductPromotionTypes;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.details.d;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.InStoreLocationType;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.InstoreDetailsData;
import au.com.woolworths.product.models.InstoreLocationDetailsData;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.MultiBuyPriceInfo;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductInlineLabelApiData;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.models.TagLabel;
import au.com.woolworths.product.models.TagStyle;
import au.com.woolworths.shop.lists.data.converters.ButtonApiDataTypeConverter;
import au.com.woolworths.shop.lists.data.converters.InStoreLocationTypeConverter;
import au.com.woolworths.shop.lists.data.converters.InfoSheetTypeConverter;
import au.com.woolworths.shop.lists.data.converters.InstoreDetailsDataConverter;
import au.com.woolworths.shop.lists.data.converters.InstoreLocationDetailsDataConverter;
import au.com.woolworths.shop.lists.data.converters.ProductIdTypeConverter;
import au.com.woolworths.shop.lists.data.converters.ProductInlineLabelApiDataConverter;
import au.com.woolworths.shop.lists.data.converters.ProductPromotionTypeConverter;
import au.com.woolworths.shop.lists.data.converters.RewardsOfferAnalyticsTypeConverter;
import au.com.woolworths.shop.lists.data.database.ProductDao_Impl;
import au.com.woolworths.shop.lists.data.entity.CategoryByProductEntity;
import au.com.woolworths.shop.lists.data.entity.ProductEntity;
import au.com.woolworths.shop.lists.data.entity.ProductsWithCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductDao_Impl;", "Lau/com/woolworths/shop/lists/data/database/ProductDao;", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductDao_Impl implements ProductDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12271a;
    public final AnonymousClass1 b;
    public final ProductInlineLabelApiDataConverter c = new ProductInlineLabelApiDataConverter();
    public final InStoreLocationTypeConverter d = new InStoreLocationTypeConverter();
    public final ProductPromotionTypeConverter e = new ProductPromotionTypeConverter();
    public final RewardsOfferAnalyticsTypeConverter f = new RewardsOfferAnalyticsTypeConverter();
    public final ButtonApiDataTypeConverter g = new ButtonApiDataTypeConverter();
    public final InfoSheetTypeConverter h = new InfoSheetTypeConverter();
    public final InstoreLocationDetailsDataConverter i = new InstoreLocationDetailsDataConverter();
    public final InstoreDetailsDataConverter j = new InstoreDetailsDataConverter();
    public final AnonymousClass3 k;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ProductEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<ProductEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `product` WHERE `product_id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ProductEntity entity = (ProductEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, ProductIdTypeConverter.a(entity.getProductId()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductDao_Impl$3", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM product";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductDao_Impl$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12272a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[RewardsOfferStatus.values().length];
            try {
                iArr[RewardsOfferStatus.NOT_ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardsOfferStatus.ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardsOfferStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RewardsOfferStatus.ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RewardsOfferStatus.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RewardsOfferStatus.MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RewardsOfferStatus.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12272a = iArr;
            int[] iArr2 = new int[TagStyle.values().length];
            try {
                iArr2[TagStyle.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TagStyle.FEATURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TagStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [au.com.woolworths.shop.lists.data.database.ProductDao_Impl$1] */
    public ProductDao_Impl(RoomDatabase roomDatabase) {
        this.f12271a = roomDatabase;
        this.b = new EntityInsertionAdapter<ProductEntity>(roomDatabase) { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public final String b() {
                return "INSERT OR REPLACE INTO `product` (`product_id`,`name`,`product_image`,`badge_image`,`price`,`unit_price`,`available`,`was_price`,`multibuy_price`,`multibuy_unitprice`,`purchase_warning`,`inline_labels`,`disclaimer`,`tobacco`,`source`,`listminimum`,`listmaximum`,`listincrement`,`listdefault_`,`listunitLabel`,`instore_detailslocationText`,`instore_detailslocationType`,`promo_infotype`,`promo_infolabel`,`offer_info_offerId`,`offer_info_displayStatus`,`offer_info_displayExpiry`,`offer_info_minimumSpend`,`offer_info_offerStatus`,`offer_info_offerAnalytics`,`offer_info_boostButton`,`tag_label_text`,`tag_label_style`,`in_store_availability_info_button`,`in_store_availability_info_status`,`in_store_availability_info_infoSheet`,`marketplace_info_imageUrl`,`marketplace_info_title`,`marketplace_info_sellerName`,`marketplace_info_brandName`,`marketplace_info_lowestMarketPriceDescription`,`multi_buy_price_info_price`,`multi_buy_price_info_unitPrice`,`member_price_info_header`,`member_price_info_title`,`member_price_info_subtitle`,`instore_location_data_details`,`instore_location_data_displayInfo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public final void d(SupportSQLiteStatement statement, Object obj) {
                String str;
                ProductEntity entity = (ProductEntity) obj;
                Intrinsics.h(statement, "statement");
                Intrinsics.h(entity, "entity");
                ProductDao_Impl productDao_Impl = this;
                ButtonApiDataTypeConverter buttonApiDataTypeConverter = productDao_Impl.g;
                statement.z(1, ProductIdTypeConverter.a(entity.getProductId()));
                statement.z(2, entity.getName());
                String productImage = entity.getProductImage();
                if (productImage == null) {
                    statement.N0(3);
                } else {
                    statement.z(3, productImage);
                }
                String badgeImage = entity.getBadgeImage();
                if (badgeImage == null) {
                    statement.N0(4);
                } else {
                    statement.z(4, badgeImage);
                }
                if (entity.getPrice() == null) {
                    statement.N0(5);
                } else {
                    statement.C0(5, r5.intValue());
                }
                String unitPriceDescription = entity.getUnitPriceDescription();
                if (unitPriceDescription == null) {
                    statement.N0(6);
                } else {
                    statement.z(6, unitPriceDescription);
                }
                statement.C0(7, entity.isAvailable() ? 1L : 0L);
                String wasPrice = entity.getWasPrice();
                if (wasPrice == null) {
                    statement.N0(8);
                } else {
                    statement.z(8, wasPrice);
                }
                String multiBuyPrice = entity.getMultiBuyPrice();
                if (multiBuyPrice == null) {
                    statement.N0(9);
                } else {
                    statement.z(9, multiBuyPrice);
                }
                String multiBuyUnitPrice = entity.getMultiBuyUnitPrice();
                if (multiBuyUnitPrice == null) {
                    statement.N0(10);
                } else {
                    statement.z(10, multiBuyUnitPrice);
                }
                String purchaseWarning = entity.getPurchaseWarning();
                if (purchaseWarning == null) {
                    statement.N0(11);
                } else {
                    statement.z(11, purchaseWarning);
                }
                List<ProductInlineLabelApiData> inlineLabels = entity.getInlineLabels();
                productDao_Impl.c.getClass();
                String strJ = inlineLabels != null ? ProductInlineLabelApiDataConverter.f12268a.j(inlineLabels) : null;
                if (strJ == null) {
                    statement.N0(12);
                } else {
                    statement.z(12, strJ);
                }
                String disclaimer = entity.getDisclaimer();
                if (disclaimer == null) {
                    statement.N0(13);
                } else {
                    statement.z(13, disclaimer);
                }
                Boolean boolIsTobacco = entity.isTobacco();
                if ((boolIsTobacco != null ? Integer.valueOf(boolIsTobacco.booleanValue() ? 1 : 0) : null) == null) {
                    statement.N0(14);
                } else {
                    statement.C0(14, r5.intValue());
                }
                String source = entity.getSource();
                if (source == null) {
                    statement.N0(15);
                } else {
                    statement.z(15, source);
                }
                ProductShoppingList productShoppingList = entity.getProductShoppingList();
                statement.j2(productShoppingList.getMinimum(), 16);
                statement.j2(productShoppingList.getMaximum(), 17);
                statement.j2(productShoppingList.getIncrement(), 18);
                statement.j2(productShoppingList.getDefaultValue(), 19);
                String unitLabel = productShoppingList.getUnitLabel();
                if (unitLabel == null) {
                    statement.N0(20);
                } else {
                    statement.z(20, unitLabel);
                }
                InstoreDetailsData inStoreDetails = entity.getInStoreDetails();
                if (inStoreDetails != null) {
                    String locationText = inStoreDetails.getLocationText();
                    if (locationText == null) {
                        statement.N0(21);
                    } else {
                        statement.z(21, locationText);
                    }
                    InStoreLocationType locationType = inStoreDetails.getLocationType();
                    productDao_Impl.d.getClass();
                    String strName = locationType != null ? locationType.name() : null;
                    if (strName == null) {
                        statement.N0(22);
                    } else {
                        statement.z(22, strName);
                    }
                } else {
                    statement.N0(21);
                    statement.N0(22);
                }
                PromotionInfo promotionInfo = entity.getPromotionInfo();
                if (promotionInfo != null) {
                    ProductPromotionTypeConverter productPromotionTypeConverter = productDao_Impl.e;
                    ProductPromotionTypes type = promotionInfo.getType();
                    productPromotionTypeConverter.getClass();
                    String strName2 = type != null ? type.name() : null;
                    if (strName2 == null) {
                        statement.N0(23);
                    } else {
                        statement.z(23, strName2);
                    }
                    statement.z(24, promotionInfo.getLabel());
                } else {
                    statement.N0(23);
                    statement.N0(24);
                }
                RewardsOfferInfo rewardsOfferInfo = entity.getRewardsOfferInfo();
                String str2 = "UNKNOWN";
                if (rewardsOfferInfo != null) {
                    statement.z(25, rewardsOfferInfo.getD());
                    String m = rewardsOfferInfo.getM();
                    if (m == null) {
                        statement.N0(26);
                    } else {
                        statement.z(26, m);
                    }
                    statement.z(27, rewardsOfferInfo.getD());
                    String e = rewardsOfferInfo.getE();
                    if (e == null) {
                        statement.N0(28);
                    } else {
                        statement.z(28, e);
                    }
                    switch (WhenMappings.f12272a[rewardsOfferInfo.getN().ordinal()]) {
                        case 1:
                            str = "NOT_ACTIVATED";
                            break;
                        case 2:
                            str = "ACTIVATED";
                            break;
                        case 3:
                            str = "PENDING";
                            break;
                        case 4:
                            str = "ENDED";
                            break;
                        case 5:
                            str = "COMPLETED";
                            break;
                        case 6:
                            str = "MISSED";
                            break;
                        case 7:
                            str = "UNKNOWN";
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    statement.z(29, str);
                    RewardsOfferAnalyticsData r = rewardsOfferInfo.getR();
                    productDao_Impl.f.getClass();
                    String strJ2 = r != null ? RewardsOfferAnalyticsTypeConverter.f12269a.j(r) : null;
                    if (strJ2 == null) {
                        statement.N0(30);
                    } else {
                        statement.z(30, strJ2);
                    }
                    ButtonApiData boostButton = rewardsOfferInfo.getBoostButton();
                    buttonApiDataTypeConverter.getClass();
                    String strJ3 = boostButton != null ? ButtonApiDataTypeConverter.f12264a.j(boostButton) : null;
                    if (strJ3 == null) {
                        statement.N0(31);
                    } else {
                        statement.z(31, strJ3);
                    }
                } else {
                    statement.N0(25);
                    statement.N0(26);
                    statement.N0(27);
                    statement.N0(28);
                    statement.N0(29);
                    statement.N0(30);
                    statement.N0(31);
                }
                TagLabel tagLabel = entity.getTagLabel();
                if (tagLabel != null) {
                    statement.z(32, tagLabel.getText());
                    TagStyle style = tagLabel.getStyle();
                    if (style == null) {
                        statement.N0(33);
                    } else {
                        int i = WhenMappings.b[style.ordinal()];
                        if (i == 1) {
                            str2 = "UNAVAILABLE";
                        } else if (i == 2) {
                            str2 = "FEATURED";
                        } else if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        statement.z(33, str2);
                    }
                } else {
                    statement.N0(32);
                    statement.N0(33);
                }
                InStoreAvailabilityInfo inStoreAvailabilityInfo = entity.getInStoreAvailabilityInfo();
                if (inStoreAvailabilityInfo != null) {
                    ButtonApiData button = inStoreAvailabilityInfo.getButton();
                    buttonApiDataTypeConverter.getClass();
                    String strJ4 = button != null ? ButtonApiDataTypeConverter.f12264a.j(button) : null;
                    if (strJ4 == null) {
                        statement.N0(34);
                    } else {
                        statement.z(34, strJ4);
                    }
                    String status = inStoreAvailabilityInfo.getStatus();
                    if (status == null) {
                        statement.N0(35);
                    } else {
                        statement.z(35, status);
                    }
                    InfoSheet infoSheet = inStoreAvailabilityInfo.getInfoSheet();
                    productDao_Impl.h.getClass();
                    String strJ5 = infoSheet != null ? InfoSheetTypeConverter.f12265a.j(infoSheet) : null;
                    if (strJ5 == null) {
                        statement.N0(36);
                    } else {
                        statement.z(36, strJ5);
                    }
                } else {
                    statement.N0(34);
                    statement.N0(35);
                    statement.N0(36);
                }
                ProductListMarketplace marketplace = entity.getMarketplace();
                if (marketplace != null) {
                    statement.z(37, marketplace.getImageUrl());
                    statement.z(38, marketplace.getTitle());
                    statement.z(39, marketplace.getSellerName());
                    statement.z(40, marketplace.getBrandName());
                    String lowestMarketPriceDescription = marketplace.getLowestMarketPriceDescription();
                    if (lowestMarketPriceDescription == null) {
                        statement.N0(41);
                    } else {
                        statement.z(41, lowestMarketPriceDescription);
                    }
                } else {
                    statement.N0(37);
                    statement.N0(38);
                    statement.N0(39);
                    statement.N0(40);
                    statement.N0(41);
                }
                MultiBuyPriceInfo multiBuyPriceInfo = entity.getMultiBuyPriceInfo();
                if (multiBuyPriceInfo != null) {
                    statement.z(42, multiBuyPriceInfo.getPrice());
                    String unitPrice = multiBuyPriceInfo.getUnitPrice();
                    if (unitPrice == null) {
                        statement.N0(43);
                    } else {
                        statement.z(43, unitPrice);
                    }
                } else {
                    statement.N0(42);
                    statement.N0(43);
                }
                MemberPriceInfo memberPriceInfo = entity.getMemberPriceInfo();
                if (memberPriceInfo != null) {
                    statement.z(44, memberPriceInfo.getHeader());
                    statement.z(45, memberPriceInfo.getTitle());
                    String subtitle = memberPriceInfo.getSubtitle();
                    if (subtitle == null) {
                        statement.N0(46);
                    } else {
                        statement.z(46, subtitle);
                    }
                } else {
                    statement.N0(44);
                    statement.N0(45);
                    statement.N0(46);
                }
                InStoreLocationData inStoreLocationData = entity.getInStoreLocationData();
                if (inStoreLocationData == null) {
                    statement.N0(47);
                    statement.N0(48);
                    return;
                }
                InstoreLocationDetailsData details = inStoreLocationData.getDetails();
                productDao_Impl.i.getClass();
                String strJ6 = details != null ? InstoreLocationDetailsDataConverter.f12267a.j(details) : null;
                if (strJ6 == null) {
                    statement.N0(47);
                } else {
                    statement.z(47, strJ6);
                }
                InstoreDetailsData displayInfo = inStoreLocationData.getDisplayInfo();
                productDao_Impl.j.getClass();
                String strJ7 = displayInfo != null ? InstoreDetailsDataConverter.f12266a.j(displayInfo) : null;
                if (strJ7 == null) {
                    statement.N0(48);
                } else {
                    statement.z(48, strJ7);
                }
            }
        };
        new AnonymousClass2(roomDatabase);
        this.k = new AnonymousClass3(roomDatabase);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final RewardsOfferStatus i(ProductDao_Impl productDao_Impl, String str) {
        switch (str.hashCode()) {
            case -2020551013:
                if (str.equals("MISSED")) {
                    return RewardsOfferStatus.MISSED;
                }
                break;
            case -1303979599:
                if (str.equals("ACTIVATED")) {
                    return RewardsOfferStatus.ACTIVATED;
                }
                break;
            case 35394935:
                if (str.equals("PENDING")) {
                    return RewardsOfferStatus.PENDING;
                }
                break;
            case 66114202:
                if (str.equals("ENDED")) {
                    return RewardsOfferStatus.ENDED;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return RewardsOfferStatus.d;
                }
                break;
            case 1079017253:
                if (str.equals("NOT_ACTIVATED")) {
                    return RewardsOfferStatus.NOT_ACTIVATED;
                }
                break;
            case 1383663147:
                if (str.equals("COMPLETED")) {
                    return RewardsOfferStatus.COMPLETED;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    public static final TagStyle j(ProductDao_Impl productDao_Impl, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 433141802) {
            if (iHashCode != 491967534) {
                if (iHashCode == 1487498288 && str.equals("UNAVAILABLE")) {
                    return TagStyle.UNAVAILABLE;
                }
            } else if (str.equals("FEATURED")) {
                return TagStyle.FEATURED;
            }
        } else if (str.equals("UNKNOWN")) {
            return TagStyle.UNKNOWN;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object a(Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12271a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$deleteAllItems$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ProductDao_Impl productDao_Impl = this.d;
                ProductDao_Impl.AnonymousClass3 anonymousClass3 = productDao_Impl.k;
                RoomDatabase roomDatabase = productDao_Impl.f12271a;
                SupportSQLiteStatement supportSQLiteStatementA = anonymousClass3.a();
                try {
                    roomDatabase.c();
                    try {
                        int iP = supportSQLiteStatementA.P();
                        roomDatabase.r();
                        return Integer.valueOf(iP);
                    } finally {
                        roomDatabase.l();
                    }
                } finally {
                    anonymousClass3.c(supportSQLiteStatementA);
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object b(final ArrayList arrayList, Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12271a, new Callable<Integer>(this) { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$deleteAllByProductIds$2
            public final /* synthetic */ ProductDao_Impl e;

            {
                this.e = this;
            }

            @Override // java.util.concurrent.Callable
            public final Integer call() {
                StringBuilder sbS = YU.a.s("DELETE FROM product WHERE product_id IN (");
                ArrayList arrayList2 = arrayList;
                StringUtil.a(arrayList2.size(), sbS);
                sbS.append(")");
                String string = sbS.toString();
                Intrinsics.g(string, "toString(...)");
                RoomDatabase roomDatabase = this.e.f12271a;
                SupportSQLiteStatement supportSQLiteStatementD = roomDatabase.d(string);
                Iterator it = arrayList2.iterator();
                int i = 1;
                while (it.hasNext()) {
                    supportSQLiteStatementD.z(i, ProductIdTypeConverter.a((ProductId) it.next()));
                    i++;
                }
                roomDatabase.c();
                try {
                    int iP = supportSQLiteStatementD.P();
                    roomDatabase.r();
                    return Integer.valueOf(iP);
                } finally {
                    roomDatabase.l();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object c(Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT product_id FROM product");
        return CoroutinesRoom.Companion.c(this.f12271a, false, new CancellationSignal(), new Callable<List<? extends ProductId>>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$fetchAllProductIds$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ProductId> call() {
                RoomDatabase roomDatabase = this.d.f12271a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(0);
                        Intrinsics.g(string, "getString(...)");
                        arrayList.add(ProductId.INSTANCE.create(string));
                    }
                    return arrayList;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Flow d() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM product");
        Callable<ProductsWithCategory> callable = new Callable<ProductsWithCategory>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$products$1
            /* JADX WARN: Removed duplicated region for block: B:106:0x0342 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0350  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0358  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x035b A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0366 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x036b  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x036f A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0384 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x03ca  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x03da  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x03dd A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:151:0x03ee  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x03f1 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0406  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x0409 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:159:0x041c  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x041f A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:164:0x043d A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:169:0x044b  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x045a  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x045d A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:177:0x0476 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:185:0x048f  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x0498  */
            /* JADX WARN: Removed duplicated region for block: B:189:0x049b A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:192:0x04a8 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:203:0x04df A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:217:0x050e  */
            /* JADX WARN: Removed duplicated region for block: B:220:0x0533  */
            /* JADX WARN: Removed duplicated region for block: B:222:0x0537 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:226:0x054d A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:231:0x055b  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x056a  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x056d A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:239:0x057f A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:247:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x05af  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x05b2 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:255:0x05c4 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:259:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:262:0x05d8  */
            /* JADX WARN: Removed duplicated region for block: B:263:0x05db A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:267:0x05f7 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:270:0x0639 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            /* JADX WARN: Removed duplicated region for block: B:272:0x0641 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:3:0x000f, B:4:0x017f, B:8:0x0189, B:10:0x0196, B:14:0x01a5, B:16:0x01b6, B:20:0x01db, B:24:0x01ea, B:28:0x01fd, B:32:0x020c, B:36:0x0217, B:40:0x0226, B:44:0x0235, B:48:0x0244, B:53:0x0256, B:57:0x0263, B:62:0x028f, B:67:0x02a2, B:71:0x02ab, B:74:0x02b7, B:79:0x02c9, B:83:0x02ef, B:85:0x02fc, B:91:0x030c, B:95:0x0319, B:99:0x0326, B:101:0x032d, B:103:0x0334, B:104:0x033c, B:106:0x0342, B:112:0x0352, B:116:0x035f, B:118:0x0366, B:121:0x036f, B:122:0x037e, B:124:0x0384, B:126:0x038c, B:128:0x0394, B:130:0x039c, B:132:0x03a4, B:134:0x03ac, B:145:0x03cd, B:149:0x03e1, B:153:0x03f5, B:157:0x040d, B:161:0x0423, B:162:0x0437, B:164:0x043d, B:170:0x044d, B:174:0x0468, B:175:0x0470, B:177:0x0476, B:179:0x047e, B:186:0x0492, B:190:0x049f, B:192:0x04a8, B:196:0x04b5, B:200:0x04c2, B:201:0x04d9, B:203:0x04df, B:205:0x04e7, B:207:0x04ef, B:209:0x04f7, B:218:0x0511, B:223:0x053d, B:224:0x0547, B:226:0x054d, B:232:0x055d, B:236:0x0571, B:237:0x0579, B:239:0x057f, B:241:0x0587, B:248:0x059b, B:252:0x05b6, B:253:0x05be, B:255:0x05c4, B:260:0x05d2, B:264:0x05df, B:268:0x05fc, B:269:0x0612, B:267:0x05f7, B:263:0x05db, B:251:0x05b2, B:235:0x056d, B:222:0x0537, B:199:0x04be, B:195:0x04b1, B:270:0x0639, B:271:0x0640, B:189:0x049b, B:173:0x045d, B:160:0x041f, B:156:0x0409, B:152:0x03f1, B:148:0x03dd, B:272:0x0641, B:273:0x0648, B:115:0x035b, B:98:0x0322, B:94:0x0315, B:82:0x02ea, B:78:0x02c2, B:65:0x0298, B:61:0x0288, B:56:0x025f, B:52:0x024f, B:47:0x023e, B:43:0x022f, B:39:0x0220, B:31:0x0206, B:27:0x01f3, B:23:0x01e4, B:19:0x01d5), top: B:278:0x000f }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final au.com.woolworths.shop.lists.data.entity.ProductsWithCategory call() {
                /*
                    Method dump skipped, instructions count: 1617
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$products$1.call():java.lang.Object");
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12271a, false, new String[]{"category", "product"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object e(ProductId productId, ContinuationImpl continuationImpl) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM product WHERE product_id = ?");
        roomSQLiteQueryA.z(1, ProductIdTypeConverter.a(productId));
        return CoroutinesRoom.Companion.c(this.f12271a, false, new CancellationSignal(), new Callable<ProductsWithCategory>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$fetchProduct$2
            /* JADX WARN: Removed duplicated region for block: B:108:0x0345 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x035b  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x035e A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0369 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x036e  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0372 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x0387 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03cd  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x03dd  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x03e0 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:153:0x03f1  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x03f4 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:157:0x0409  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x040c A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:161:0x041f  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x0422 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:166:0x043f A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:171:0x044d  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x045c  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x045f A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:179:0x0478 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:187:0x0491  */
            /* JADX WARN: Removed duplicated region for block: B:190:0x049a  */
            /* JADX WARN: Removed duplicated region for block: B:191:0x049d A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:194:0x04aa A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:205:0x04e1 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:219:0x0510  */
            /* JADX WARN: Removed duplicated region for block: B:222:0x0535  */
            /* JADX WARN: Removed duplicated region for block: B:223:0x0538 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:227:0x054d A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:232:0x055b  */
            /* JADX WARN: Removed duplicated region for block: B:235:0x056a  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x056d A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:240:0x057f A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:248:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:251:0x05af  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x05b2 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:256:0x05c4 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:260:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:263:0x05d8  */
            /* JADX WARN: Removed duplicated region for block: B:264:0x05db A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:268:0x05f7 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:271:0x0639 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            /* JADX WARN: Removed duplicated region for block: B:273:0x0641 A[Catch: all -> 0x01a4, TryCatch #1 {all -> 0x01a4, blocks: (B:5:0x0061, B:6:0x0181, B:10:0x018b, B:12:0x0198, B:16:0x01a7, B:18:0x01b8, B:22:0x01dd, B:26:0x01ec, B:30:0x01ff, B:34:0x020e, B:38:0x0219, B:42:0x0228, B:46:0x0237, B:50:0x0246, B:55:0x0258, B:59:0x0265, B:64:0x0291, B:69:0x02a4, B:73:0x02ad, B:76:0x02b9, B:81:0x02cb, B:85:0x02f2, B:87:0x02ff, B:93:0x030f, B:97:0x031c, B:101:0x0329, B:103:0x0330, B:105:0x0337, B:106:0x033f, B:108:0x0345, B:114:0x0355, B:118:0x0362, B:120:0x0369, B:123:0x0372, B:124:0x0381, B:126:0x0387, B:128:0x038f, B:130:0x0397, B:132:0x039f, B:134:0x03a7, B:136:0x03af, B:147:0x03d0, B:151:0x03e4, B:155:0x03f8, B:159:0x0410, B:163:0x0426, B:164:0x0439, B:166:0x043f, B:172:0x044f, B:176:0x046a, B:177:0x0472, B:179:0x0478, B:181:0x0480, B:188:0x0494, B:192:0x04a1, B:194:0x04aa, B:198:0x04b7, B:202:0x04c4, B:203:0x04db, B:205:0x04e1, B:207:0x04e9, B:209:0x04f1, B:211:0x04f9, B:220:0x0513, B:224:0x053d, B:225:0x0547, B:227:0x054d, B:233:0x055d, B:237:0x0571, B:238:0x0579, B:240:0x057f, B:242:0x0587, B:249:0x059b, B:253:0x05b6, B:254:0x05be, B:256:0x05c4, B:261:0x05d2, B:265:0x05df, B:269:0x05fc, B:270:0x0612, B:268:0x05f7, B:264:0x05db, B:252:0x05b2, B:236:0x056d, B:223:0x0538, B:201:0x04c0, B:197:0x04b3, B:271:0x0639, B:272:0x0640, B:191:0x049d, B:175:0x045f, B:162:0x0422, B:158:0x040c, B:154:0x03f4, B:150:0x03e0, B:273:0x0641, B:274:0x0648, B:117:0x035e, B:100:0x0325, B:96:0x0318, B:84:0x02ec, B:80:0x02c4, B:67:0x029a, B:63:0x028a, B:58:0x0261, B:54:0x0251, B:49:0x0240, B:45:0x0231, B:41:0x0222, B:33:0x0208, B:29:0x01f5, B:25:0x01e6, B:21:0x01d7), top: B:283:0x0061 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final au.com.woolworths.shop.lists.data.entity.ProductsWithCategory call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1626
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$fetchProduct$2.call():java.lang.Object");
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object f(final ProductEntity productEntity, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f12271a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$insert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                ProductDao_Impl productDao_Impl = this.d;
                RoomDatabase roomDatabase = productDao_Impl.f12271a;
                roomDatabase.c();
                try {
                    productDao_Impl.b.e(productEntity);
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductDao
    public final Object g(final ArrayList arrayList, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f12271a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.ProductDao_Impl$insertAll$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                ProductDao_Impl productDao_Impl = this.d;
                RoomDatabase roomDatabase = productDao_Impl.f12271a;
                roomDatabase.c();
                try {
                    productDao_Impl.b.f(arrayList);
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public final void h(ArrayMap arrayMap) {
        Set setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.a(arrayMap, new d(this, 28));
            return;
        }
        StringBuilder sbS = YU.a.s("SELECT `id`,`product_id`,`name`,`category_level` FROM `category` WHERE `product_id` IN (");
        int size = setKeySet.size();
        StringUtil.a(size, sbS);
        sbS.append(")");
        String string = sbS.toString();
        Intrinsics.g(string, "toString(...)");
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryA.z(i, (String) it.next());
            i++;
        }
        Cursor cursorB = DBUtil.b(this.f12271a, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorB, "product_id");
            if (iA == -1) {
                cursorB.close();
                return;
            }
            while (cursorB.moveToNext()) {
                String string2 = cursorB.getString(iA);
                Intrinsics.g(string2, "getString(...)");
                ArrayList arrayList = (ArrayList) arrayMap.get(string2);
                if (arrayList != null) {
                    long j = cursorB.getLong(0);
                    String string3 = cursorB.getString(1);
                    Intrinsics.g(string3, "getString(...)");
                    ProductId productIdCreate = ProductId.INSTANCE.create(string3);
                    String string4 = cursorB.getString(2);
                    Intrinsics.g(string4, "getString(...)");
                    arrayList.add(new CategoryByProductEntity(j, productIdCreate, string4, cursorB.getInt(3)));
                }
            }
        } finally {
            cursorB.close();
        }
    }
}
