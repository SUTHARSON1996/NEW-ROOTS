package com.example.home.newrootsv1.Adapter;


public interface FragmentChanger {


    //for sales section
    void switchToEquipSales();


    //for article section
    void switchToPicPost();
    void switchToVideoPost();
    void switchToArticlePost();
    void switchToAudioPost();


    //picPostFunctions
    void capturePic();
    void choosePic();

    //audioPostFunctions
    void captureAudio();
    void chooseAudio();

    //videoPostFunctions
    void captureVideo();
    void chooseVideo();

    //single article view
    void changeToSingleArticle(int imgID,String artHead,String artContent,String artDate);


    //single product view
    void changeToSingleProduct(int position);
    //single products image view
    void changeToProductsImage(int resId);

    //resellerDeatils
    void changeToResellerDetails();

    //post Review of a product
    void postReviewOfProduct();

    //jump to basic profile info
    void changeToBasicProfileInfo();

    //changing basic profile pic
    void changeBasicProfilePic();

    //order online
    void changeToOrderOnline();

    //order by phone
    void changeToOrderByPhone();


    //travel frag
    void changeToTravelFrag();

    //services frag
    void changeToServicesFrag();

    //travel full screen
    void changeToFullScreenTravel(String villageName, String placeName, String placeDesc, int imgId);


    //services full screen
    void changeToFullScreenServices(String serviceHead, String date, int imgId);

    //services post frag
    void changeToServicesPostFrag();



}
