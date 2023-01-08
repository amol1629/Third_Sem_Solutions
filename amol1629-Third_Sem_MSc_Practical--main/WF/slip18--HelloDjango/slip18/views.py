from django.http import HttpResponse

def hello(request):
    return HttpResponse("Hello! I am learning Django")