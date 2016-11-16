package com.example.android.learnenglish;

/**
 * Created by Precious on 30/10/2016.
 */

/**
 * Word class represents a Vocabulary word that the user wants to learn
 * It contains a default amd a nupe translation and Image for that word.
 */
public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * nupe translation for the word
     */
    private String mNupeTranslation;

    /**Constant value that represents no image was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Image Resource Id for the Word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * @param defaultTranslation is the word in a language that the user is
     *                           already familiar with (such as English
     * @param nupeTranslation   is the word for the Nupe language
     */
    public Word(String defaultTranslation, String nupeTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mNupeTranslation = nupeTranslation;
    }

    /**
     * @param defaultTranslation is the word in a language that the user is
     *                           already familiar with (such as English
     * @param nupeTranslation   is the word for the nupe language
     *
     * @param imageResourceId is the Image resource ID for the word
     */
    public Word(String defaultTranslation, String nupeTranslation, int imageResourceId) {
        this(defaultTranslation, nupeTranslation);
        this.mImageResourceId = imageResourceId;
    }


    /**
     * Get the default translation of the word
     *
     * @return the default word Translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the nupe translation of the word
     *
     * @return the default nupe translation
     */
    public String getNupeTranslation() {
        return mNupeTranslation;
    }

    /**
     * Return the imgae resource ID of the word
     */
    public int getImageResourceId(){return mImageResourceId;}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
