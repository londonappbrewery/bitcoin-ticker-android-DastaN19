package com.londonappbrewery.bitcointicker;

/**
 * Created by ankit on 11-08-2017.
 */
import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {
    private String mBitcoin;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mBitcoin = jsonObject.getString("ask");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

    }

    public String getmBitcoin() {
        return mBitcoin;
    }
}