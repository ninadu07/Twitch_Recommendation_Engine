package com.niesodium.jupiter.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

public class FavoriteRequestBody {
    private final Item favoriteItem;

    //annotator: JSON string -> request 对象
    @JsonCreator
    public FavoriteRequestBody(@JsonProperty("favorite") Item favoriteItem) {
        this.favoriteItem = favoriteItem;
    }
    //@JsonProperty("favorite")只能把JSON convert成java对象， 不能反过来
    //如果放在Class name下，也可以，那样不仅可以json->java也可以java->json
    //但是这里我们不需要把json返回给前端


    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
