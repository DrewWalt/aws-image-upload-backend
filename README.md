# aws-image-upload-backend
Backend of project used to connect to AWS s3 and upload and download images.  No database and the instances are stored in memory so information besides the images will be lost when restarted.

When using make sure to put your own bucket name in src/main/java/com/drewjwalton/awsimageupload/bucket/BucketName.

Also make sure to put your own access and root keys in src/main/java/com/drewjwalton/awsimageupload/config/AmazonConfig.
